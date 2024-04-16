package com.sumologic.cloudwatch_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.564Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cloudwatchSource.CloudwatchSourcePathCustomServices")
@software.amazon.jsii.Jsii.Proxy(CloudwatchSourcePathCustomServices.Jsii$Proxy.class)
public interface CloudwatchSourcePathCustomServices extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudwatch_source#prefixes CloudwatchSource#prefixes}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPrefixes() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudwatch_source#service_name CloudwatchSource#service_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getServiceName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudwatchSourcePathCustomServices}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchSourcePathCustomServices}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchSourcePathCustomServices> {
        java.util.List<java.lang.String> prefixes;
        java.lang.String serviceName;

        /**
         * Sets the value of {@link CloudwatchSourcePathCustomServices#getPrefixes}
         * @param prefixes Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudwatch_source#prefixes CloudwatchSource#prefixes}.
         * @return {@code this}
         */
        public Builder prefixes(java.util.List<java.lang.String> prefixes) {
            this.prefixes = prefixes;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchSourcePathCustomServices#getServiceName}
         * @param serviceName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cloudwatch_source#service_name CloudwatchSource#service_name}.
         * @return {@code this}
         */
        public Builder serviceName(java.lang.String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudwatchSourcePathCustomServices}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchSourcePathCustomServices build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudwatchSourcePathCustomServices}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchSourcePathCustomServices {
        private final java.util.List<java.lang.String> prefixes;
        private final java.lang.String serviceName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.prefixes = software.amazon.jsii.Kernel.get(this, "prefixes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.serviceName = software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.prefixes = builder.prefixes;
            this.serviceName = builder.serviceName;
        }

        @Override
        public final java.util.List<java.lang.String> getPrefixes() {
            return this.prefixes;
        }

        @Override
        public final java.lang.String getServiceName() {
            return this.serviceName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPrefixes() != null) {
                data.set("prefixes", om.valueToTree(this.getPrefixes()));
            }
            if (this.getServiceName() != null) {
                data.set("serviceName", om.valueToTree(this.getServiceName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cloudwatchSource.CloudwatchSourcePathCustomServices"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchSourcePathCustomServices.Jsii$Proxy that = (CloudwatchSourcePathCustomServices.Jsii$Proxy) o;

            if (this.prefixes != null ? !this.prefixes.equals(that.prefixes) : that.prefixes != null) return false;
            return this.serviceName != null ? this.serviceName.equals(that.serviceName) : that.serviceName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.prefixes != null ? this.prefixes.hashCode() : 0;
            result = 31 * result + (this.serviceName != null ? this.serviceName.hashCode() : 0);
            return result;
        }
    }
}
