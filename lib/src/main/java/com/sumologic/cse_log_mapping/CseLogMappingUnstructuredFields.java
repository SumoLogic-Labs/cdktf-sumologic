package com.sumologic.cse_log_mapping;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.751Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseLogMapping.CseLogMappingUnstructuredFields")
@software.amazon.jsii.Jsii.Proxy(CseLogMappingUnstructuredFields.Jsii$Proxy.class)
public interface CseLogMappingUnstructuredFields extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#pattern_names CseLogMapping#pattern_names}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPatternNames();

    /**
     * @return a {@link Builder} of {@link CseLogMappingUnstructuredFields}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseLogMappingUnstructuredFields}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseLogMappingUnstructuredFields> {
        java.util.List<java.lang.String> patternNames;

        /**
         * Sets the value of {@link CseLogMappingUnstructuredFields#getPatternNames}
         * @param patternNames Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#pattern_names CseLogMapping#pattern_names}. This parameter is required.
         * @return {@code this}
         */
        public Builder patternNames(java.util.List<java.lang.String> patternNames) {
            this.patternNames = patternNames;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseLogMappingUnstructuredFields}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseLogMappingUnstructuredFields build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseLogMappingUnstructuredFields}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseLogMappingUnstructuredFields {
        private final java.util.List<java.lang.String> patternNames;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.patternNames = software.amazon.jsii.Kernel.get(this, "patternNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.patternNames = java.util.Objects.requireNonNull(builder.patternNames, "patternNames is required");
        }

        @Override
        public final java.util.List<java.lang.String> getPatternNames() {
            return this.patternNames;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("patternNames", om.valueToTree(this.getPatternNames()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseLogMapping.CseLogMappingUnstructuredFields"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseLogMappingUnstructuredFields.Jsii$Proxy that = (CseLogMappingUnstructuredFields.Jsii$Proxy) o;

            return this.patternNames.equals(that.patternNames);
        }

        @Override
        public final int hashCode() {
            int result = this.patternNames.hashCode();
            return result;
        }
    }
}
