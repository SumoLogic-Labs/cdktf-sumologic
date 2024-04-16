package com.sumologic.cse_log_mapping;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.750Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseLogMapping.CseLogMappingStructuredInputs")
@software.amazon.jsii.Jsii.Proxy(CseLogMappingStructuredInputs.Jsii$Proxy.class)
public interface CseLogMappingStructuredInputs extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#event_id_pattern CseLogMapping#event_id_pattern}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEventIdPattern();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#log_format CseLogMapping#log_format}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLogFormat();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#product CseLogMapping#product}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getProduct();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#vendor CseLogMapping#vendor}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVendor();

    /**
     * @return a {@link Builder} of {@link CseLogMappingStructuredInputs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseLogMappingStructuredInputs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseLogMappingStructuredInputs> {
        java.lang.String eventIdPattern;
        java.lang.String logFormat;
        java.lang.String product;
        java.lang.String vendor;

        /**
         * Sets the value of {@link CseLogMappingStructuredInputs#getEventIdPattern}
         * @param eventIdPattern Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#event_id_pattern CseLogMapping#event_id_pattern}. This parameter is required.
         * @return {@code this}
         */
        public Builder eventIdPattern(java.lang.String eventIdPattern) {
            this.eventIdPattern = eventIdPattern;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingStructuredInputs#getLogFormat}
         * @param logFormat Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#log_format CseLogMapping#log_format}. This parameter is required.
         * @return {@code this}
         */
        public Builder logFormat(java.lang.String logFormat) {
            this.logFormat = logFormat;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingStructuredInputs#getProduct}
         * @param product Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#product CseLogMapping#product}. This parameter is required.
         * @return {@code this}
         */
        public Builder product(java.lang.String product) {
            this.product = product;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingStructuredInputs#getVendor}
         * @param vendor Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#vendor CseLogMapping#vendor}. This parameter is required.
         * @return {@code this}
         */
        public Builder vendor(java.lang.String vendor) {
            this.vendor = vendor;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseLogMappingStructuredInputs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseLogMappingStructuredInputs build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseLogMappingStructuredInputs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseLogMappingStructuredInputs {
        private final java.lang.String eventIdPattern;
        private final java.lang.String logFormat;
        private final java.lang.String product;
        private final java.lang.String vendor;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.eventIdPattern = software.amazon.jsii.Kernel.get(this, "eventIdPattern", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logFormat = software.amazon.jsii.Kernel.get(this, "logFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.product = software.amazon.jsii.Kernel.get(this, "product", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vendor = software.amazon.jsii.Kernel.get(this, "vendor", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.eventIdPattern = java.util.Objects.requireNonNull(builder.eventIdPattern, "eventIdPattern is required");
            this.logFormat = java.util.Objects.requireNonNull(builder.logFormat, "logFormat is required");
            this.product = java.util.Objects.requireNonNull(builder.product, "product is required");
            this.vendor = java.util.Objects.requireNonNull(builder.vendor, "vendor is required");
        }

        @Override
        public final java.lang.String getEventIdPattern() {
            return this.eventIdPattern;
        }

        @Override
        public final java.lang.String getLogFormat() {
            return this.logFormat;
        }

        @Override
        public final java.lang.String getProduct() {
            return this.product;
        }

        @Override
        public final java.lang.String getVendor() {
            return this.vendor;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("eventIdPattern", om.valueToTree(this.getEventIdPattern()));
            data.set("logFormat", om.valueToTree(this.getLogFormat()));
            data.set("product", om.valueToTree(this.getProduct()));
            data.set("vendor", om.valueToTree(this.getVendor()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseLogMapping.CseLogMappingStructuredInputs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseLogMappingStructuredInputs.Jsii$Proxy that = (CseLogMappingStructuredInputs.Jsii$Proxy) o;

            if (!eventIdPattern.equals(that.eventIdPattern)) return false;
            if (!logFormat.equals(that.logFormat)) return false;
            if (!product.equals(that.product)) return false;
            return this.vendor.equals(that.vendor);
        }

        @Override
        public final int hashCode() {
            int result = this.eventIdPattern.hashCode();
            result = 31 * result + (this.logFormat.hashCode());
            result = 31 * result + (this.product.hashCode());
            result = 31 * result + (this.vendor.hashCode());
            return result;
        }
    }
}
