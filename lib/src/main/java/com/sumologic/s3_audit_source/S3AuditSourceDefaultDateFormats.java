package com.sumologic.s3_audit_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.167Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.s3AuditSource.S3AuditSourceDefaultDateFormats")
@software.amazon.jsii.Jsii.Proxy(S3AuditSourceDefaultDateFormats.Jsii$Proxy.class)
public interface S3AuditSourceDefaultDateFormats extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/s3_audit_source#format S3AuditSource#format}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFormat();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/s3_audit_source#locator S3AuditSource#locator}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLocator() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3AuditSourceDefaultDateFormats}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3AuditSourceDefaultDateFormats}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3AuditSourceDefaultDateFormats> {
        java.lang.String format;
        java.lang.String locator;

        /**
         * Sets the value of {@link S3AuditSourceDefaultDateFormats#getFormat}
         * @param format Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/s3_audit_source#format S3AuditSource#format}. This parameter is required.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link S3AuditSourceDefaultDateFormats#getLocator}
         * @param locator Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/s3_audit_source#locator S3AuditSource#locator}.
         * @return {@code this}
         */
        public Builder locator(java.lang.String locator) {
            this.locator = locator;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3AuditSourceDefaultDateFormats}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3AuditSourceDefaultDateFormats build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3AuditSourceDefaultDateFormats}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3AuditSourceDefaultDateFormats {
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
            struct.set("fqn", om.valueToTree("sumologic.s3AuditSource.S3AuditSourceDefaultDateFormats"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3AuditSourceDefaultDateFormats.Jsii$Proxy that = (S3AuditSourceDefaultDateFormats.Jsii$Proxy) o;

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
