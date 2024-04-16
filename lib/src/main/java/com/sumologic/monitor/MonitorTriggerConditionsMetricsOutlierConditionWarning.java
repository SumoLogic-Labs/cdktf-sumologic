package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.121Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionWarning")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsMetricsOutlierConditionWarning.Jsii$Proxy.class)
public interface MonitorTriggerConditionsMetricsOutlierConditionWarning extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#baseline_window Monitor#baseline_window}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBaselineWindow() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#threshold Monitor#threshold}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getThreshold() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsMetricsOutlierConditionWarning}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsMetricsOutlierConditionWarning}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsMetricsOutlierConditionWarning> {
        java.lang.String baselineWindow;
        java.lang.Number threshold;

        /**
         * Sets the value of {@link MonitorTriggerConditionsMetricsOutlierConditionWarning#getBaselineWindow}
         * @param baselineWindow Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#baseline_window Monitor#baseline_window}.
         * @return {@code this}
         */
        public Builder baselineWindow(java.lang.String baselineWindow) {
            this.baselineWindow = baselineWindow;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsMetricsOutlierConditionWarning#getThreshold}
         * @param threshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#threshold Monitor#threshold}.
         * @return {@code this}
         */
        public Builder threshold(java.lang.Number threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsMetricsOutlierConditionWarning}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsMetricsOutlierConditionWarning build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsMetricsOutlierConditionWarning}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsMetricsOutlierConditionWarning {
        private final java.lang.String baselineWindow;
        private final java.lang.Number threshold;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.baselineWindow = software.amazon.jsii.Kernel.get(this, "baselineWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.threshold = software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.baselineWindow = builder.baselineWindow;
            this.threshold = builder.threshold;
        }

        @Override
        public final java.lang.String getBaselineWindow() {
            return this.baselineWindow;
        }

        @Override
        public final java.lang.Number getThreshold() {
            return this.threshold;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBaselineWindow() != null) {
                data.set("baselineWindow", om.valueToTree(this.getBaselineWindow()));
            }
            if (this.getThreshold() != null) {
                data.set("threshold", om.valueToTree(this.getThreshold()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionWarning"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsMetricsOutlierConditionWarning.Jsii$Proxy that = (MonitorTriggerConditionsMetricsOutlierConditionWarning.Jsii$Proxy) o;

            if (this.baselineWindow != null ? !this.baselineWindow.equals(that.baselineWindow) : that.baselineWindow != null) return false;
            return this.threshold != null ? this.threshold.equals(that.threshold) : that.threshold == null;
        }

        @Override
        public final int hashCode() {
            int result = this.baselineWindow != null ? this.baselineWindow.hashCode() : 0;
            result = 31 * result + (this.threshold != null ? this.threshold.hashCode() : 0);
            return result;
        }
    }
}
