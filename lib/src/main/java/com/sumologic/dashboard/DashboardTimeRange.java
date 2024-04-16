package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.860Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardTimeRange")
@software.amazon.jsii.Jsii.Proxy(DashboardTimeRange.Jsii$Proxy.class)
public interface DashboardTimeRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * begin_bounded_time_range block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#begin_bounded_time_range Dashboard#begin_bounded_time_range}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange getBeginBoundedTimeRange() {
        return null;
    }

    /**
     * complete_literal_time_range block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#complete_literal_time_range Dashboard#complete_literal_time_range}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRange getCompleteLiteralTimeRange() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardTimeRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardTimeRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardTimeRange> {
        com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange beginBoundedTimeRange;
        com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRange completeLiteralTimeRange;

        /**
         * Sets the value of {@link DashboardTimeRange#getBeginBoundedTimeRange}
         * @param beginBoundedTimeRange begin_bounded_time_range block.
         *                              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#begin_bounded_time_range Dashboard#begin_bounded_time_range}
         * @return {@code this}
         */
        public Builder beginBoundedTimeRange(com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange beginBoundedTimeRange) {
            this.beginBoundedTimeRange = beginBoundedTimeRange;
            return this;
        }

        /**
         * Sets the value of {@link DashboardTimeRange#getCompleteLiteralTimeRange}
         * @param completeLiteralTimeRange complete_literal_time_range block.
         *                                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#complete_literal_time_range Dashboard#complete_literal_time_range}
         * @return {@code this}
         */
        public Builder completeLiteralTimeRange(com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRange completeLiteralTimeRange) {
            this.completeLiteralTimeRange = completeLiteralTimeRange;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardTimeRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardTimeRange build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardTimeRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardTimeRange {
        private final com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange beginBoundedTimeRange;
        private final com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRange completeLiteralTimeRange;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.beginBoundedTimeRange = software.amazon.jsii.Kernel.get(this, "beginBoundedTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange.class));
            this.completeLiteralTimeRange = software.amazon.jsii.Kernel.get(this, "completeLiteralTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRange.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.beginBoundedTimeRange = builder.beginBoundedTimeRange;
            this.completeLiteralTimeRange = builder.completeLiteralTimeRange;
        }

        @Override
        public final com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange getBeginBoundedTimeRange() {
            return this.beginBoundedTimeRange;
        }

        @Override
        public final com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRange getCompleteLiteralTimeRange() {
            return this.completeLiteralTimeRange;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBeginBoundedTimeRange() != null) {
                data.set("beginBoundedTimeRange", om.valueToTree(this.getBeginBoundedTimeRange()));
            }
            if (this.getCompleteLiteralTimeRange() != null) {
                data.set("completeLiteralTimeRange", om.valueToTree(this.getCompleteLiteralTimeRange()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardTimeRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardTimeRange.Jsii$Proxy that = (DashboardTimeRange.Jsii$Proxy) o;

            if (this.beginBoundedTimeRange != null ? !this.beginBoundedTimeRange.equals(that.beginBoundedTimeRange) : that.beginBoundedTimeRange != null) return false;
            return this.completeLiteralTimeRange != null ? this.completeLiteralTimeRange.equals(that.completeLiteralTimeRange) : that.completeLiteralTimeRange == null;
        }

        @Override
        public final int hashCode() {
            int result = this.beginBoundedTimeRange != null ? this.beginBoundedTimeRange.hashCode() : 0;
            result = 31 * result + (this.completeLiteralTimeRange != null ? this.completeLiteralTimeRange.hashCode() : 0);
            return result;
        }
    }
}
