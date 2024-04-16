package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.121Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsMetricsMissingDataCondition.Jsii$Proxy.class)
public interface MonitorTriggerConditionsMetricsMissingDataCondition extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTimeRange();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#trigger_source Monitor#trigger_source}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTriggerSource();

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsMetricsMissingDataCondition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsMetricsMissingDataCondition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsMetricsMissingDataCondition> {
        java.lang.String timeRange;
        java.lang.String triggerSource;

        /**
         * Sets the value of {@link MonitorTriggerConditionsMetricsMissingDataCondition#getTimeRange}
         * @param timeRange Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}. This parameter is required.
         * @return {@code this}
         */
        public Builder timeRange(java.lang.String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsMetricsMissingDataCondition#getTriggerSource}
         * @param triggerSource Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#trigger_source Monitor#trigger_source}. This parameter is required.
         * @return {@code this}
         */
        public Builder triggerSource(java.lang.String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsMetricsMissingDataCondition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsMetricsMissingDataCondition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsMetricsMissingDataCondition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsMetricsMissingDataCondition {
        private final java.lang.String timeRange;
        private final java.lang.String triggerSource;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.timeRange = software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.triggerSource = software.amazon.jsii.Kernel.get(this, "triggerSource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.timeRange = java.util.Objects.requireNonNull(builder.timeRange, "timeRange is required");
            this.triggerSource = java.util.Objects.requireNonNull(builder.triggerSource, "triggerSource is required");
        }

        @Override
        public final java.lang.String getTimeRange() {
            return this.timeRange;
        }

        @Override
        public final java.lang.String getTriggerSource() {
            return this.triggerSource;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("timeRange", om.valueToTree(this.getTimeRange()));
            data.set("triggerSource", om.valueToTree(this.getTriggerSource()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsMetricsMissingDataCondition.Jsii$Proxy that = (MonitorTriggerConditionsMetricsMissingDataCondition.Jsii$Proxy) o;

            if (!timeRange.equals(that.timeRange)) return false;
            return this.triggerSource.equals(that.triggerSource);
        }

        @Override
        public final int hashCode() {
            int result = this.timeRange.hashCode();
            result = 31 * result + (this.triggerSource.hashCode());
            return result;
        }
    }
}
