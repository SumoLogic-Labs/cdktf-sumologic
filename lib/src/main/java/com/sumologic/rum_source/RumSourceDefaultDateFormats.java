package com.sumologic.rum_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.151Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.rumSource.RumSourceDefaultDateFormats")
@software.amazon.jsii.Jsii.Proxy(RumSourceDefaultDateFormats.Jsii$Proxy.class)
public interface RumSourceDefaultDateFormats extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#format RumSource#format}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFormat();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#locator RumSource#locator}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLocator() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RumSourceDefaultDateFormats}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RumSourceDefaultDateFormats}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RumSourceDefaultDateFormats> {
        java.lang.String format;
        java.lang.String locator;

        /**
         * Sets the value of {@link RumSourceDefaultDateFormats#getFormat}
         * @param format Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#format RumSource#format}. This parameter is required.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link RumSourceDefaultDateFormats#getLocator}
         * @param locator Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#locator RumSource#locator}.
         * @return {@code this}
         */
        public Builder locator(java.lang.String locator) {
            this.locator = locator;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RumSourceDefaultDateFormats}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RumSourceDefaultDateFormats build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RumSourceDefaultDateFormats}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RumSourceDefaultDateFormats {
        private final java.lang.String format;
        private final java.lang.String locator;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.locator = software.amazon.jsii.Kernel.get(this, "locator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.format = java.util.Objects.requireNonNull(builder.format, "format is required");
            this.locator = builder.locator;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public final java.lang.String getLocator() {
            return this.locator;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("format", om.valueToTree(this.getFormat()));
            if (this.getLocator() != null) {
                data.set("locator", om.valueToTree(this.getLocator()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.rumSource.RumSourceDefaultDateFormats"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RumSourceDefaultDateFormats.Jsii$Proxy that = (RumSourceDefaultDateFormats.Jsii$Proxy) o;

            if (!format.equals(that.format)) return false;
            return this.locator != null ? this.locator.equals(that.locator) : that.locator == null;
        }

        @Override
        public final int hashCode() {
            int result = this.format.hashCode();
            result = 31 * result + (this.locator != null ? this.locator.hashCode() : 0);
            return result;
        }
    }
}
