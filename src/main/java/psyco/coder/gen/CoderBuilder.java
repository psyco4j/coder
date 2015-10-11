package psyco.coder.gen;

import psyco.coder.engine.BeetlEngine;
import psyco.coder.gen.param.ParamClass;
import psyco.coder.gen.param.ParamField;

import java.util.List;

/**
 * Created by peng on 15/10/11.
 */
public class CoderBuilder {
    public static ParamClass builder(String s, String pack) throws Exception {
        BuilderParam b = (BuilderParam) CoderJavabean.bean(s, pack, BuilderParam.class);
        b.setBuilderClassName(b.getClassName() + "Builder");
        return b;
    }

    public static class BuilderParam extends ParamClass {
        public String builderClassName;

        public BuilderParam(String className, String pack, List<ParamField> fields) {
            super(className, pack, fields);
        }

        public String getBuilderClassName() {
            return builderClassName;
        }

        public void setBuilderClassName(String builderClassName) {
            this.builderClassName = builderClassName;
        }
    }

    public static String exec(String s, String pack) throws Exception {
        return BeetlEngine.render("/template/builder.btl", "bp", builder(s, pack));
    }
}