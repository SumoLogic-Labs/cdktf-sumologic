package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.122Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCritical")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsMetricsStaticConditionCritical.Jsii$Proxy.class)
public interface MonitorTriggerConditionsMetricsStaticConditionCritical extends software.amazon.jsii.JsiiSerializable {

    /**
     * alert block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#alert Monitor#alert}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalAlert getAlert();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#occurrence_type Monitor#occurrence_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOccurrenceType();

    /**
     * resolution block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution Monitor#resolution}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalResolution getResolution();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTimeRange();

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsMetricsStaticConditionCritical}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsMetricsStaticConditionCritical}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsMetricsStaticConditionCritical> {
        com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalAlert alert;
        java.lang.String occurrenceType;
        com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalResolution resolution;
        java.lang.String timeRange;

        /**
         * Sets the value of {@link MonitorTriggerConditionsMetricsStaticConditionCritical#getAlert}
         * @param alert alert block. This parameter is required.
         *              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#alert Monitor#alert}
         * @return {@code this}
         */
        public Builder alert(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalAlert alert) {
            this.alert = alert;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsMetricsStaticConditionCritical#getOccurrenceType}
         * @param occurrenceType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#occurrence_type Monitor#occurrence_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder occurrenceType(java.lang.String occurrenceType) {
            this.occurrenceType = occurrenceType;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsMetricsStaticConditionCritical#getResolution}
         * @param resolution resolution block. This parameter is required.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution Monitor#resolution}
         * @return {@code this}
         */
        public Builder resolution(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalResolution resolution) {
            this.resolution = resolution;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsMetricsStaticConditionCritical#getTimeRange}
         * @param timeRange Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}. This parameter is required.
         * @return {@code this}
         */
        public Builder timeRange(java.lang.String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsMetricsStaticConditionCritical}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsMetricsStaticConditionCritical build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsMetricsStaticConditionCritical}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsMetricsStaticConditionCritical {
        private final com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalAlert alert;
        private final java.lang.String occurrenceType;
        private final com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalResolution resolution;
        private final java.lang.String timeRange;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.alert = software.amazon.jsii.Kernel.get(this, "alert", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalAlert.class));
            this.occurrenceType = software.amazon.jsii.Kernel.get(this, "occurrenceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resolution = software.amazon.jsii.Kernel.get(this, "resolution", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalResolution.class));
            this.timeRange = software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.alert = java.util.Objects.requireNonNull(builder.alert, "alert is required");
            this.occurrenceType = java.util.Objects.requireNonNull(builder.occurrenceType, "occurrenceType is required");
            this.resolution = java.util.Objects.requireNonNull(builder.resolution, "resolution is required");
            this.timeRange = java.util.Objects.requireNonNull(builder.timeRange, "timeRange is required");
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalAlert getAlert() {
            return this.alert;
        }

        @Override
        public final java.lang.String getOccurrenceType() {
            return this.occurrenceType;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCriticalResolution getResolution() {
            return this.resolution;
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

            data.set("alert", om.valueToTree(this.getAlert()));
            data.set("occurrenceType", om.valueToTree(this.getOccurrenceType()));
            data.set("resolution", om.valueToTree(this.getResolution()));
            data.set("timeRange", om.valueToTree(this.getTimeRange()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionCritical"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsMetricsStaticConditionCritical.Jsii$Proxy that = (MonitorTriggerConditionsMetricsStaticConditionCritical.Jsii$Proxy) o;

            if (!alert.equals(that.alert)) return false;
            if (!occurrenceType.equals(that.occurrenceType)) return false;
            if (!resolution.equals(that.resolution)) return false;
            return this.timeRange.equals(that.timeRange);
        }

        @Override
        public final int hashCode() {
            int result = this.alert.hashCode();
            result = 31 * result + (this.occurrenceType.hashCode());
            result = 31 * result + (this.resolution.hashCode());
            result = 31 * result + (this.timeRange.hashCode());
            return result;
        }
    }
}
