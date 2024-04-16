package com.sumologic.kinesis_log_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.059Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.kinesisLogSource.KinesisLogSourcePath")
@software.amazon.jsii.Jsii.Proxy(KinesisLogSourcePath.Jsii$Proxy.class)
public interface KinesisLogSourcePath extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#bucket_name KinesisLogSource#bucket_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucketName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#path_expression KinesisLogSource#path_expression}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPathExpression() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#scan_interval KinesisLogSource#scan_interval}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getScanInterval() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#type KinesisLogSource#type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisLogSourcePath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisLogSourcePath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisLogSourcePath> {
        java.lang.String bucketName;
        java.lang.String pathExpression;
        java.lang.Number scanInterval;
        java.lang.String type;

        /**
         * Sets the value of {@link KinesisLogSourcePath#getBucketName}
         * @param bucketName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#bucket_name KinesisLogSource#bucket_name}.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourcePath#getPathExpression}
         * @param pathExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#path_expression KinesisLogSource#path_expression}.
         * @return {@code this}
         */
        public Builder pathExpression(java.lang.String pathExpression) {
            this.pathExpression = pathExpression;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourcePath#getScanInterval}
         * @param scanInterval Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#scan_interval KinesisLogSource#scan_interval}.
         * @return {@code this}
         */
        public Builder scanInterval(java.lang.Number scanInterval) {
            this.scanInterval = scanInterval;
            return this;
        }

        /**
         * Sets the value of {@link KinesisLogSourcePath#getType}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_log_source#type KinesisLogSource#type}.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisLogSourcePath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisLogSourcePath build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KinesisLogSourcePath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisLogSourcePath {
        private final java.lang.String bucketName;
        private final java.lang.String pathExpression;
        private final java.lang.Number scanInterval;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.pathExpression = software.amazon.jsii.Kernel.get(this, "pathExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scanInterval = software.amazon.jsii.Kernel.get(this, "scanInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketName = builder.bucketName;
            this.pathExpression = builder.pathExpression;
            this.scanInterval = builder.scanInterval;
            this.type = builder.type;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
        }

        @Override
        public final java.lang.String getPathExpression() {
            return this.pathExpression;
        }

        @Override
        public final java.lang.Number getScanInterval() {
            return this.scanInterval;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBucketName() != null) {
                data.set("bucketName", om.valueToTree(this.getBucketName()));
            }
            if (this.getPathExpression() != null) {
                data.set("pathExpression", om.valueToTree(this.getPathExpression()));
            }
            if (this.getScanInterval() != null) {
                data.set("scanInterval", om.valueToTree(this.getScanInterval()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.kinesisLogSource.KinesisLogSourcePath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisLogSourcePath.Jsii$Proxy that = (KinesisLogSourcePath.Jsii$Proxy) o;

            if (this.bucketName != null ? !this.bucketName.equals(that.bucketName) : that.bucketName != null) return false;
            if (this.pathExpression != null ? !this.pathExpression.equals(that.pathExpression) : that.pathExpression != null) return false;
            if (this.scanInterval != null ? !this.scanInterval.equals(that.scanInterval) : that.scanInterval != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketName != null ? this.bucketName.hashCode() : 0;
            result = 31 * result + (this.pathExpression != null ? this.pathExpression.hashCode() : 0);
            result = 31 * result + (this.scanInterval != null ? this.scanInterval.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
