package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.875Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange")
@software.amazon.jsii.Jsii.Proxy(DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange.Jsii$Proxy.class)
public interface DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#range_name Dashboard#range_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRangeName();

    /**
     * @return a {@link Builder} of {@link DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange> {
        java.lang.String rangeName;

        /**
         * Sets the value of {@link DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange#getRangeName}
         * @param rangeName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#range_name Dashboard#range_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder rangeName(java.lang.String rangeName) {
            this.rangeName = rangeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange {
        private final java.lang.String rangeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rangeName = software.amazon.jsii.Kernel.get(this, "rangeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rangeName = java.util.Objects.requireNonNull(builder.rangeName, "rangeName is required");
        }

        @Override
        public final java.lang.String getRangeName() {
            return this.rangeName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rangeName", om.valueToTree(this.getRangeName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange.Jsii$Proxy that = (DashboardTimeRangeBeginBoundedTimeRangeToLiteralTimeRange.Jsii$Proxy) o;

            return this.rangeName.equals(that.rangeName);
        }

        @Override
        public final int hashCode() {
            int result = this.rangeName.hashCode();
            return result;
        }
    }
}
