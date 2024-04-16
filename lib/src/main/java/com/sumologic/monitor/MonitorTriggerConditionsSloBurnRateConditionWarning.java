package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.125Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionWarning")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsSloBurnRateConditionWarning.Jsii$Proxy.class)
public interface MonitorTriggerConditionsSloBurnRateConditionWarning extends software.amazon.jsii.JsiiSerializable {

    /**
     * burn_rate block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#burn_rate Monitor#burn_rate}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getBurnRate() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#burn_rate_threshold Monitor#burn_rate_threshold}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getBurnRateThreshold() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTimeRange() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsSloBurnRateConditionWarning}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsSloBurnRateConditionWarning}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsSloBurnRateConditionWarning> {
        java.lang.Object burnRate;
        java.lang.Number burnRateThreshold;
        java.lang.String timeRange;

        /**
         * Sets the value of {@link MonitorTriggerConditionsSloBurnRateConditionWarning#getBurnRate}
         * @param burnRate burn_rate block.
         *                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#burn_rate Monitor#burn_rate}
         * @return {@code this}
         */
        public Builder burnRate(com.hashicorp.cdktf.IResolvable burnRate) {
            this.burnRate = burnRate;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsSloBurnRateConditionWarning#getBurnRate}
         * @param burnRate burn_rate block.
         *                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#burn_rate Monitor#burn_rate}
         * @return {@code this}
         */
        public Builder burnRate(java.util.List<? extends com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionWarningBurnRate> burnRate) {
            this.burnRate = burnRate;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsSloBurnRateConditionWarning#getBurnRateThreshold}
         * @param burnRateThreshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#burn_rate_threshold Monitor#burn_rate_threshold}.
         * @return {@code this}
         */
        public Builder burnRateThreshold(java.lang.Number burnRateThreshold) {
            this.burnRateThreshold = burnRateThreshold;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsSloBurnRateConditionWarning#getTimeRange}
         * @param timeRange Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}.
         * @return {@code this}
         */
        public Builder timeRange(java.lang.String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsSloBurnRateConditionWarning}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsSloBurnRateConditionWarning build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsSloBurnRateConditionWarning}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsSloBurnRateConditionWarning {
        private final java.lang.Object burnRate;
        private final java.lang.Number burnRateThreshold;
        private final java.lang.String timeRange;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.burnRate = software.amazon.jsii.Kernel.get(this, "burnRate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.burnRateThreshold = software.amazon.jsii.Kernel.get(this, "burnRateThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.timeRange = software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.burnRate = builder.burnRate;
            this.burnRateThreshold = builder.burnRateThreshold;
            this.timeRange = builder.timeRange;
        }

        @Override
        public final java.lang.Object getBurnRate() {
            return this.burnRate;
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

            if (this.getBurnRate() != null) {
                data.set("burnRate", om.valueToTree(this.getBurnRate()));
            }
            if (this.getBurnRateThreshold() != null) {
                data.set("burnRateThreshold", om.valueToTree(this.getBurnRateThreshold()));
            }
            if (this.getTimeRange() != null) {
                data.set("timeRange", om.valueToTree(this.getTimeRange()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionWarning"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsSloBurnRateConditionWarning.Jsii$Proxy that = (MonitorTriggerConditionsSloBurnRateConditionWarning.Jsii$Proxy) o;

            if (this.burnRate != null ? !this.burnRate.equals(that.burnRate) : that.burnRate != null) return false;
            if (this.burnRateThreshold != null ? !this.burnRateThreshold.equals(that.burnRateThreshold) : that.burnRateThreshold != null) return false;
            return this.timeRange != null ? this.timeRange.equals(that.timeRange) : that.timeRange == null;
        }

        @Override
        public final int hashCode() {
            int result = this.burnRate != null ? this.burnRate.hashCode() : 0;
            result = 31 * result + (this.burnRateThreshold != null ? this.burnRateThreshold.hashCode() : 0);
            result = 31 * result + (this.timeRange != null ? this.timeRange.hashCode() : 0);
            return result;
        }
    }
}
