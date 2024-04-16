package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.873Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange")
@software.amazon.jsii.Jsii.Proxy(DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange.Jsii$Proxy.class)
public interface DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#iso8601_time Dashboard#iso8601_time}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIso8601Time();

    /**
     * @return a {@link Builder} of {@link DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange> {
        java.lang.String iso8601Time;

        /**
         * Sets the value of {@link DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange#getIso8601Time}
         * @param iso8601Time Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#iso8601_time Dashboard#iso8601_time}. This parameter is required.
         * @return {@code this}
         */
        public Builder iso8601Time(java.lang.String iso8601Time) {
            this.iso8601Time = iso8601Time;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange {
        private final java.lang.String iso8601Time;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.iso8601Time = software.amazon.jsii.Kernel.get(this, "iso8601Time", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.iso8601Time = java.util.Objects.requireNonNull(builder.iso8601Time, "iso8601Time is required");
        }

        @Override
        public final java.lang.String getIso8601Time() {
            return this.iso8601Time;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("iso8601Time", om.valueToTree(this.getIso8601Time()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange.Jsii$Proxy that = (DashboardTimeRangeBeginBoundedTimeRangeToIso8601TimeRange.Jsii$Proxy) o;

            return this.iso8601Time.equals(that.iso8601Time);
        }

        @Override
        public final int hashCode() {
            int result = this.iso8601Time.hashCode();
            return result;
        }
    }
}
