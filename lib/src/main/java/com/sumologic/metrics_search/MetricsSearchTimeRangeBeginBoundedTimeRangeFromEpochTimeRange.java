package com.sumologic.metrics_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.102Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.metricsSearch.MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange")
@software.amazon.jsii.Jsii.Proxy(MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange.Jsii$Proxy.class)
public interface MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#epoch_millis MetricsSearch#epoch_millis}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getEpochMillis();

    /**
     * @return a {@link Builder} of {@link MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange> {
        java.lang.Number epochMillis;

        /**
         * Sets the value of {@link MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange#getEpochMillis}
         * @param epochMillis Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#epoch_millis MetricsSearch#epoch_millis}. This parameter is required.
         * @return {@code this}
         */
        public Builder epochMillis(java.lang.Number epochMillis) {
            this.epochMillis = epochMillis;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange {
        private final java.lang.Number epochMillis;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.epochMillis = software.amazon.jsii.Kernel.get(this, "epochMillis", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.epochMillis = java.util.Objects.requireNonNull(builder.epochMillis, "epochMillis is required");
        }

        @Override
        public final java.lang.Number getEpochMillis() {
            return this.epochMillis;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("epochMillis", om.valueToTree(this.getEpochMillis()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.metricsSearch.MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange.Jsii$Proxy that = (MetricsSearchTimeRangeBeginBoundedTimeRangeFromEpochTimeRange.Jsii$Proxy) o;

            return this.epochMillis.equals(that.epochMillis);
        }

        @Override
        public final int hashCode() {
            int result = this.epochMillis.hashCode();
            return result;
        }
    }
}
