package com.sumologic.kinesis_metrics_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.064Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.kinesisMetricsSource.KinesisMetricsSourcePath")
@software.amazon.jsii.Jsii.Proxy(KinesisMetricsSourcePath.Jsii$Proxy.class)
public interface KinesisMetricsSourcePath extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_metrics_source#type KinesisMetricsSource#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * tag_filters block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_metrics_source#tag_filters KinesisMetricsSource#tag_filters}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTagFilters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KinesisMetricsSourcePath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KinesisMetricsSourcePath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KinesisMetricsSourcePath> {
        java.lang.String type;
        java.lang.Object tagFilters;

        /**
         * Sets the value of {@link KinesisMetricsSourcePath#getType}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_metrics_source#type KinesisMetricsSource#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link KinesisMetricsSourcePath#getTagFilters}
         * @param tagFilters tag_filters block.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_metrics_source#tag_filters KinesisMetricsSource#tag_filters}
         * @return {@code this}
         */
        public Builder tagFilters(com.hashicorp.cdktf.IResolvable tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        /**
         * Sets the value of {@link KinesisMetricsSourcePath#getTagFilters}
         * @param tagFilters tag_filters block.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/kinesis_metrics_source#tag_filters KinesisMetricsSource#tag_filters}
         * @return {@code this}
         */
        public Builder tagFilters(java.util.List<? extends com.sumologic.kinesis_metrics_source.KinesisMetricsSourcePathTagFilters> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KinesisMetricsSourcePath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KinesisMetricsSourcePath build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KinesisMetricsSourcePath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KinesisMetricsSourcePath {
        private final java.lang.String type;
        private final java.lang.Object tagFilters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tagFilters = software.amazon.jsii.Kernel.get(this, "tagFilters", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.tagFilters = builder.tagFilters;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Object getTagFilters() {
            return this.tagFilters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getTagFilters() != null) {
                data.set("tagFilters", om.valueToTree(this.getTagFilters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.kinesisMetricsSource.KinesisMetricsSourcePath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KinesisMetricsSourcePath.Jsii$Proxy that = (KinesisMetricsSourcePath.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.tagFilters != null ? this.tagFilters.equals(that.tagFilters) : that.tagFilters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.tagFilters != null ? this.tagFilters.hashCode() : 0);
            return result;
        }
    }
}
