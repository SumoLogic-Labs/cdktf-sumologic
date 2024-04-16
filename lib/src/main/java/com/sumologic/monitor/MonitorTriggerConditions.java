package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.117Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditions")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditions.Jsii$Proxy.class)
public interface MonitorTriggerConditions extends software.amazon.jsii.JsiiSerializable {

    /**
     * logs_missing_data_condition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#logs_missing_data_condition Monitor#logs_missing_data_condition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataCondition getLogsMissingDataCondition() {
        return null;
    }

    /**
     * logs_outlier_condition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#logs_outlier_condition Monitor#logs_outlier_condition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition getLogsOutlierCondition() {
        return null;
    }

    /**
     * logs_static_condition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#logs_static_condition Monitor#logs_static_condition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsLogsStaticCondition getLogsStaticCondition() {
        return null;
    }

    /**
     * metrics_missing_data_condition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#metrics_missing_data_condition Monitor#metrics_missing_data_condition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition getMetricsMissingDataCondition() {
        return null;
    }

    /**
     * metrics_outlier_condition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#metrics_outlier_condition Monitor#metrics_outlier_condition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition getMetricsOutlierCondition() {
        return null;
    }

    /**
     * metrics_static_condition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#metrics_static_condition Monitor#metrics_static_condition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticCondition getMetricsStaticCondition() {
        return null;
    }

    /**
     * slo_burn_rate_condition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#slo_burn_rate_condition Monitor#slo_burn_rate_condition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition getSloBurnRateCondition() {
        return null;
    }

    /**
     * slo_sli_condition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#slo_sli_condition Monitor#slo_sli_condition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloSliCondition getSloSliCondition() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditions> {
        com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataCondition logsMissingDataCondition;
        com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition logsOutlierCondition;
        com.sumologic.monitor.MonitorTriggerConditionsLogsStaticCondition logsStaticCondition;
        com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition metricsMissingDataCondition;
        com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition metricsOutlierCondition;
        com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticCondition metricsStaticCondition;
        com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition sloBurnRateCondition;
        com.sumologic.monitor.MonitorTriggerConditionsSloSliCondition sloSliCondition;

        /**
         * Sets the value of {@link MonitorTriggerConditions#getLogsMissingDataCondition}
         * @param logsMissingDataCondition logs_missing_data_condition block.
         *                                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#logs_missing_data_condition Monitor#logs_missing_data_condition}
         * @return {@code this}
         */
        public Builder logsMissingDataCondition(com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataCondition logsMissingDataCondition) {
            this.logsMissingDataCondition = logsMissingDataCondition;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditions#getLogsOutlierCondition}
         * @param logsOutlierCondition logs_outlier_condition block.
         *                             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#logs_outlier_condition Monitor#logs_outlier_condition}
         * @return {@code this}
         */
        public Builder logsOutlierCondition(com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition logsOutlierCondition) {
            this.logsOutlierCondition = logsOutlierCondition;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditions#getLogsStaticCondition}
         * @param logsStaticCondition logs_static_condition block.
         *                            Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#logs_static_condition Monitor#logs_static_condition}
         * @return {@code this}
         */
        public Builder logsStaticCondition(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticCondition logsStaticCondition) {
            this.logsStaticCondition = logsStaticCondition;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditions#getMetricsMissingDataCondition}
         * @param metricsMissingDataCondition metrics_missing_data_condition block.
         *                                    Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#metrics_missing_data_condition Monitor#metrics_missing_data_condition}
         * @return {@code this}
         */
        public Builder metricsMissingDataCondition(com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition metricsMissingDataCondition) {
            this.metricsMissingDataCondition = metricsMissingDataCondition;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditions#getMetricsOutlierCondition}
         * @param metricsOutlierCondition metrics_outlier_condition block.
         *                                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#metrics_outlier_condition Monitor#metrics_outlier_condition}
         * @return {@code this}
         */
        public Builder metricsOutlierCondition(com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition metricsOutlierCondition) {
            this.metricsOutlierCondition = metricsOutlierCondition;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditions#getMetricsStaticCondition}
         * @param metricsStaticCondition metrics_static_condition block.
         *                               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#metrics_static_condition Monitor#metrics_static_condition}
         * @return {@code this}
         */
        public Builder metricsStaticCondition(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticCondition metricsStaticCondition) {
            this.metricsStaticCondition = metricsStaticCondition;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditions#getSloBurnRateCondition}
         * @param sloBurnRateCondition slo_burn_rate_condition block.
         *                             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#slo_burn_rate_condition Monitor#slo_burn_rate_condition}
         * @return {@code this}
         */
        public Builder sloBurnRateCondition(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition sloBurnRateCondition) {
            this.sloBurnRateCondition = sloBurnRateCondition;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditions#getSloSliCondition}
         * @param sloSliCondition slo_sli_condition block.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#slo_sli_condition Monitor#slo_sli_condition}
         * @return {@code this}
         */
        public Builder sloSliCondition(com.sumologic.monitor.MonitorTriggerConditionsSloSliCondition sloSliCondition) {
            this.sloSliCondition = sloSliCondition;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditions {
        private final com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataCondition logsMissingDataCondition;
        private final com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition logsOutlierCondition;
        private final com.sumologic.monitor.MonitorTriggerConditionsLogsStaticCondition logsStaticCondition;
        private final com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition metricsMissingDataCondition;
        private final com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition metricsOutlierCondition;
        private final com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticCondition metricsStaticCondition;
        private final com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition sloBurnRateCondition;
        private final com.sumologic.monitor.MonitorTriggerConditionsSloSliCondition sloSliCondition;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.logsMissingDataCondition = software.amazon.jsii.Kernel.get(this, "logsMissingDataCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataCondition.class));
            this.logsOutlierCondition = software.amazon.jsii.Kernel.get(this, "logsOutlierCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition.class));
            this.logsStaticCondition = software.amazon.jsii.Kernel.get(this, "logsStaticCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticCondition.class));
            this.metricsMissingDataCondition = software.amazon.jsii.Kernel.get(this, "metricsMissingDataCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition.class));
            this.metricsOutlierCondition = software.amazon.jsii.Kernel.get(this, "metricsOutlierCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition.class));
            this.metricsStaticCondition = software.amazon.jsii.Kernel.get(this, "metricsStaticCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticCondition.class));
            this.sloBurnRateCondition = software.amazon.jsii.Kernel.get(this, "sloBurnRateCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition.class));
            this.sloSliCondition = software.amazon.jsii.Kernel.get(this, "sloSliCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloSliCondition.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.logsMissingDataCondition = builder.logsMissingDataCondition;
            this.logsOutlierCondition = builder.logsOutlierCondition;
            this.logsStaticCondition = builder.logsStaticCondition;
            this.metricsMissingDataCondition = builder.metricsMissingDataCondition;
            this.metricsOutlierCondition = builder.metricsOutlierCondition;
            this.metricsStaticCondition = builder.metricsStaticCondition;
            this.sloBurnRateCondition = builder.sloBurnRateCondition;
            this.sloSliCondition = builder.sloSliCondition;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataCondition getLogsMissingDataCondition() {
            return this.logsMissingDataCondition;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition getLogsOutlierCondition() {
            return this.logsOutlierCondition;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsLogsStaticCondition getLogsStaticCondition() {
            return this.logsStaticCondition;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition getMetricsMissingDataCondition() {
            return this.metricsMissingDataCondition;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition getMetricsOutlierCondition() {
            return this.metricsOutlierCondition;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticCondition getMetricsStaticCondition() {
            return this.metricsStaticCondition;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition getSloBurnRateCondition() {
            return this.sloBurnRateCondition;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsSloSliCondition getSloSliCondition() {
            return this.sloSliCondition;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLogsMissingDataCondition() != null) {
                data.set("logsMissingDataCondition", om.valueToTree(this.getLogsMissingDataCondition()));
            }
            if (this.getLogsOutlierCondition() != null) {
                data.set("logsOutlierCondition", om.valueToTree(this.getLogsOutlierCondition()));
            }
            if (this.getLogsStaticCondition() != null) {
                data.set("logsStaticCondition", om.valueToTree(this.getLogsStaticCondition()));
            }
            if (this.getMetricsMissingDataCondition() != null) {
                data.set("metricsMissingDataCondition", om.valueToTree(this.getMetricsMissingDataCondition()));
            }
            if (this.getMetricsOutlierCondition() != null) {
                data.set("metricsOutlierCondition", om.valueToTree(this.getMetricsOutlierCondition()));
            }
            if (this.getMetricsStaticCondition() != null) {
                data.set("metricsStaticCondition", om.valueToTree(this.getMetricsStaticCondition()));
            }
            if (this.getSloBurnRateCondition() != null) {
                data.set("sloBurnRateCondition", om.valueToTree(this.getSloBurnRateCondition()));
            }
            if (this.getSloSliCondition() != null) {
                data.set("sloSliCondition", om.valueToTree(this.getSloSliCondition()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditions.Jsii$Proxy that = (MonitorTriggerConditions.Jsii$Proxy) o;

            if (this.logsMissingDataCondition != null ? !this.logsMissingDataCondition.equals(that.logsMissingDataCondition) : that.logsMissingDataCondition != null) return false;
            if (this.logsOutlierCondition != null ? !this.logsOutlierCondition.equals(that.logsOutlierCondition) : that.logsOutlierCondition != null) return false;
            if (this.logsStaticCondition != null ? !this.logsStaticCondition.equals(that.logsStaticCondition) : that.logsStaticCondition != null) return false;
            if (this.metricsMissingDataCondition != null ? !this.metricsMissingDataCondition.equals(that.metricsMissingDataCondition) : that.metricsMissingDataCondition != null) return false;
            if (this.metricsOutlierCondition != null ? !this.metricsOutlierCondition.equals(that.metricsOutlierCondition) : that.metricsOutlierCondition != null) return false;
            if (this.metricsStaticCondition != null ? !this.metricsStaticCondition.equals(that.metricsStaticCondition) : that.metricsStaticCondition != null) return false;
            if (this.sloBurnRateCondition != null ? !this.sloBurnRateCondition.equals(that.sloBurnRateCondition) : that.sloBurnRateCondition != null) return false;
            return this.sloSliCondition != null ? this.sloSliCondition.equals(that.sloSliCondition) : that.sloSliCondition == null;
        }

        @Override
        public final int hashCode() {
            int result = this.logsMissingDataCondition != null ? this.logsMissingDataCondition.hashCode() : 0;
            result = 31 * result + (this.logsOutlierCondition != null ? this.logsOutlierCondition.hashCode() : 0);
            result = 31 * result + (this.logsStaticCondition != null ? this.logsStaticCondition.hashCode() : 0);
            result = 31 * result + (this.metricsMissingDataCondition != null ? this.metricsMissingDataCondition.hashCode() : 0);
            result = 31 * result + (this.metricsOutlierCondition != null ? this.metricsOutlierCondition.hashCode() : 0);
            result = 31 * result + (this.metricsStaticCondition != null ? this.metricsStaticCondition.hashCode() : 0);
            result = 31 * result + (this.sloBurnRateCondition != null ? this.sloBurnRateCondition.hashCode() : 0);
            result = 31 * result + (this.sloSliCondition != null ? this.sloSliCondition.hashCode() : 0);
            return result;
        }
    }
}
