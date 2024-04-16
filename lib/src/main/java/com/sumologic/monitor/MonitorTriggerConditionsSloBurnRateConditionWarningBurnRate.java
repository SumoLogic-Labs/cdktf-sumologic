package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.125Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate.Jsii$Proxy.class)
public interface MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#burn_rate_threshold Monitor#burn_rate_threshold}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getBurnRateThreshold();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTimeRange();

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate> {
        java.lang.Number burnRateThreshold;
        java.lang.String timeRange;

        /**
         * Sets the value of {@link MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate#getBurnRateThreshold}
         * @param burnRateThreshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#burn_rate_threshold Monitor#burn_rate_threshold}. This parameter is required.
         * @return {@code this}
         */
        public Builder burnRateThreshold(java.lang.Number burnRateThreshold) {
            this.burnRateThreshold = burnRateThreshold;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate#getTimeRange}
         * @param timeRange Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}. This parameter is required.
         * @return {@code this}
         */
        public Builder timeRange(java.lang.String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate {
        private final java.lang.Number burnRateThreshold;
        private final java.lang.String timeRange;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.burnRateThreshold = software.amazon.jsii.Kernel.get(this, "burnRateThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.timeRange = software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.burnRateThreshold = java.util.Objects.requireNonNull(builder.burnRateThreshold, "burnRateThreshold is required");
            this.timeRange = java.util.Objects.requireNonNull(builder.timeRange, "timeRange is required");
        }

        @Override
        public final java.lang.Number getBurnRateThreshold() {
            return this.burnRateThreshold;
        }

        @Override
        public final java.lang.String getTimeRange() {
            return this.timeRange;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("burnRateThreshold", om.valueToTree(this.getBurnRateThreshold()));
            data.set("timeRange", om.valueToTree(this.getTimeRange()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate.Jsii$Proxy that = (MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate.Jsii$Proxy) o;

            if (!burnRateThreshold.equals(that.burnRateThreshold)) return false;
            return this.timeRange.equals(that.timeRange);
        }

        @Override
        public final int hashCode() {
            int result = this.burnRateThreshold.hashCode();
            result = 31 * result + (this.timeRange.hashCode());
            return result;
        }
    }
}
