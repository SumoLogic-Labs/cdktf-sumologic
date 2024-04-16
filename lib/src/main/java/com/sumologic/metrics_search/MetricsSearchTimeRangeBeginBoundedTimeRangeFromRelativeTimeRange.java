package com.sumologic.metrics_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.103Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.metricsSearch.MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange")
@software.amazon.jsii.Jsii.Proxy(MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange.Jsii$Proxy.class)
public interface MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#relative_time MetricsSearch#relative_time}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRelativeTime();

    /**
     * @return a {@link Builder} of {@link MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange> {
        java.lang.String relativeTime;

        /**
         * Sets the value of {@link MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange#getRelativeTime}
         * @param relativeTime Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#relative_time MetricsSearch#relative_time}. This parameter is required.
         * @return {@code this}
         */
        public Builder relativeTime(java.lang.String relativeTime) {
            this.relativeTime = relativeTime;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange {
        private final java.lang.String relativeTime;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.relativeTime = software.amazon.jsii.Kernel.get(this, "relativeTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.relativeTime = java.util.Objects.requireNonNull(builder.relativeTime, "relativeTime is required");
        }

        @Override
        public final java.lang.String getRelativeTime() {
            return this.relativeTime;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("relativeTime", om.valueToTree(this.getRelativeTime()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.metricsSearch.MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange.Jsii$Proxy that = (MetricsSearchTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange.Jsii$Proxy) o;

            return this.relativeTime.equals(that.relativeTime);
        }

        @Override
        public final int hashCode() {
            int result = this.relativeTime.hashCode();
            return result;
        }
    }
}
