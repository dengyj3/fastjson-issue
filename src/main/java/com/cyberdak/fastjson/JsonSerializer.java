package com.cyberdak.fastjson;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JsonSerializer {
private static final String NAMESPACE = "teslaSpace";
private static final Charset CHARSET = Charset.forName("UTF-8");

public static <T> void serialize(T obj, OutputStream out) {
    setTeslaJson();
    JSONWriter writer = null;
    try {
        writer = new JSONWriter(new OutputStreamWriter(out, CHARSET.newEncoder().onMalformedInput(CodingErrorAction.IGNORE)));
        writer.config(SerializerFeature.QuoteFieldNames, true);
        writer.config(SerializerFeature.SkipTransientField, true);
        writer.config(SerializerFeature.SortField, true);
        writer.config(SerializerFeature.WriteEnumUsingToString, false);
        writer.config(SerializerFeature.WriteClassName, true);
        writer.config(SerializerFeature.DisableCircularReferenceDetect, true);
        writer.writeObject(obj);
        writer.flush();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (writer != null) {
            try {
                writer.close();
            } catch (Exception e) {
            }
        }
    }
}

public static <T> T deserialize(byte[] in) {
    setTeslaJson();
    return (T) JSON.parse(in, 0, in.length, CHARSET.newDecoder(), Feature.AllowArbitraryCommas,
            Feature.IgnoreNotMatch, Feature.SortFeidFastMatch, Feature.DisableCircularReferenceDetect,
            Feature.AutoCloseSource);
}


private static void setTeslaJson() {
    if (!JSON.DEFAULT_TYPE_KEY.equals(NAMESPACE)) {
        JSON.setDefaultTypeKey(NAMESPACE);
    }
    if (!SerializeConfig.globalInstance.getTypeKey().equals(NAMESPACE)){
        SerializeConfig.globalInstance.setTypeKey(NAMESPACE);
    }
}
}