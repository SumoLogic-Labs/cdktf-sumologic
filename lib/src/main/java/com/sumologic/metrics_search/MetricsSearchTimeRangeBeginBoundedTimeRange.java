package com.sumologic.metrics_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.102Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.metricsSearch.MetricsSearchTimeRangeBeginBoundedTimeRange")
@software.amazon.jsii.Jsii.Proxy(MetricsSearchTimeRangeBeginBoundedTimeRange.Jsii$Proxy.class)
public interface MetricsSearchTimeRangeBeginBoundedTimeRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * from block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#from MetricsSearch#from}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFrom getFrom();

    /**
     * to block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#to MetricsSearch#to}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeTo getTo() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MetricsSearchTimeRangeBeginBoundedTimeRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetricsSearchTimeRangeBeginBoundedTimeRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetricsSearchTimeRangeBeginBoundedTimeRange> {
        com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFrom from;
        com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeTo to;

        /**
         * Sets the value of {@link MetricsSearchTimeRangeBeginBoundedTimeRange#getFrom}
         * @param from from block. This parameter is required.
         *             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#from MetricsSearch#from}
         * @return {@code this}
         */
        public Builder from(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFrom from) {
            this.from = from;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchTimeRangeBeginBoundedTimeRange#getTo}
         * @param to to block.
         *           Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#to MetricsSearch#to}
         * @return {@code this}
         */
        public Builder to(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeTo to) {
            this.to = to;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MetricsSearchTimeRangeBeginBoundedTimeRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetricsSearchTimeRangeBeginBoundedTimeRange build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MetricsSearchTimeRangeBeginBoundedTimeRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetricsSearchTimeRangeBeginBoundedTimeRange {
        private final com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFrom from;
        private final com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeTo to;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.from = software.amazon.jsii.Kernel.get(this, "from", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFrom.class));
            this.to = software.amazon.jsii.Kernel.get(this, "to", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeTo.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.from = java.util.Objects.requireNonNull(builder.from, "from is required");
            this.to = builder.to;
        }

        @Override
        public final com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeFrom getFrom() {
            return this.from;
        }

        @Override
        public final com.sumologic.metrics_search.MetricsSearchTimeRangeBeginBoundedTimeRangeTo getTo() {
            return this.to;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("from", om.valueToTree(this.getFrom()));
            if (this.getTo() != null) {
                data.set("to", om.valueToTree(this.getTo()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.metricsSearch.MetricsSearchTimeRangeBeginBoundedTimeRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetricsSearchTimeRangeBeginBoundedTimeRange.Jsii$Proxy that = (MetricsSearchTimeRangeBeginBoundedTimeRange.Jsii$Proxy) o;

            if (!from.equals(that.from)) return false;
            return this.to != null ? this.to.equals(that.to) : that.to == null;
        }

        @Override
        public final int hashCode() {
            int result = this.from.hashCode();
            result = 31 * result + (this.to != null ? this.to.hashCode() : 0);
            return result;
        }
    }
}
