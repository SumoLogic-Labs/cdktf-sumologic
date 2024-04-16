package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.119Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCritical")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsLogsStaticConditionCritical.Jsii$Proxy.class)
public interface MonitorTriggerConditionsLogsStaticConditionCritical extends software.amazon.jsii.JsiiSerializable {

    /**
     * alert block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#alert Monitor#alert}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalAlert getAlert();

    /**
     * resolution block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution Monitor#resolution}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalResolution getResolution();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTimeRange();

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsLogsStaticConditionCritical}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsLogsStaticConditionCritical}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsLogsStaticConditionCritical> {
        com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalAlert alert;
        com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalResolution resolution;
        java.lang.String timeRange;

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsStaticConditionCritical#getAlert}
         * @param alert alert block. This parameter is required.
         *              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#alert Monitor#alert}
         * @return {@code this}
         */
        public Builder alert(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalAlert alert) {
            this.alert = alert;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsStaticConditionCritical#getResolution}
         * @param resolution resolution block. This parameter is required.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution Monitor#resolution}
         * @return {@code this}
         */
        public Builder resolution(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalResolution resolution) {
            this.resolution = resolution;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsStaticConditionCritical#getTimeRange}
         * @param timeRange Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}. This parameter is required.
         * @return {@code this}
         */
        public Builder timeRange(java.lang.String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsLogsStaticConditionCritical}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsLogsStaticConditionCritical build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsLogsStaticConditionCritical}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsLogsStaticConditionCritical {
        private final com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalAlert alert;
        private final com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalResolution resolution;
        private final java.lang.String timeRange;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.alert = software.amazon.jsii.Kernel.get(this, "alert", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalAlert.class));
            this.resolution = software.amazon.jsii.Kernel.get(this, "resolution", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalResolution.class));
            this.timeRange = software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.alert = java.util.Objects.requireNonNull(builder.alert, "alert is required");
            this.resolution = java.util.Objects.requireNonNull(builder.resolution, "resolution is required");
            this.timeRange = java.util.Objects.requireNonNull(builder.timeRange, "timeRange is required");
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalAlert getAlert() {
            return this.alert;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalResolution getResolution() {
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
            data.set("resolution", om.valueToTree(this.getResolution()));
            data.set("timeRange", om.valueToTree(this.getTimeRange()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCritical"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsLogsStaticConditionCritical.Jsii$Proxy that = (MonitorTriggerConditionsLogsStaticConditionCritical.Jsii$Proxy) o;

            if (!alert.equals(that.alert)) return false;
            if (!resolution.equals(that.resolution)) return false;
            return this.timeRange.equals(that.timeRange);
        }

        @Override
        public final int hashCode() {
            int result = this.alert.hashCode();
            result = 31 * result + (this.resolution.hashCode());
            result = 31 * result + (this.timeRange.hashCode());
            return result;
        }
    }
}
