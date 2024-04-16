package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.852Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange")
@software.amazon.jsii.Jsii.Proxy(DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange.Jsii$Proxy.class)
public interface DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * from block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#from Dashboard#from}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom getFrom();

    /**
     * to block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#to Dashboard#to}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo getTo() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange> {
        com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom from;
        com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo to;

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange#getFrom}
         * @param from from block. This parameter is required.
         *             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#from Dashboard#from}
         * @return {@code this}
         */
        public Builder from(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom from) {
            this.from = from;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange#getTo}
         * @param to to block.
         *           Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#to Dashboard#to}
         * @return {@code this}
         */
        public Builder to(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo to) {
            this.to = to;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange {
        private final com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom from;
        private final com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo to;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.from = software.amazon.jsii.Kernel.get(this, "from", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom.class));
            this.to = software.amazon.jsii.Kernel.get(this, "to", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo.class));
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
        public final com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeFrom getFrom() {
            return this.from;
        }

        @Override
        public final com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeTo getTo() {
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
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange.Jsii$Proxy that = (DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange.Jsii$Proxy) o;

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
