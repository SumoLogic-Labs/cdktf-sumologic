package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.087Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange.Jsii$Proxy.class)
public interface LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * from block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#from LogSearch#from}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom getFrom();

    /**
     * to block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#to LogSearch#to}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo getTo() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange> {
        com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom from;
        com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo to;

        /**
         * Sets the value of {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange#getFrom}
         * @param from from block. This parameter is required.
         *             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#from LogSearch#from}
         * @return {@code this}
         */
        public Builder from(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom from) {
            this.from = from;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange#getTo}
         * @param to to block.
         *           Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#to LogSearch#to}
         * @return {@code this}
         */
        public Builder to(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo to) {
            this.to = to;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange {
        private final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom from;
        private final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo to;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.from = software.amazon.jsii.Kernel.get(this, "from", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom.class));
            this.to = software.amazon.jsii.Kernel.get(this, "to", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo.class));
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
        public final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom getFrom() {
            return this.from;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeTo getTo() {
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
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange.Jsii$Proxy that = (LogSearchScheduleParseableTimeRangeBeginBoundedTimeRange.Jsii$Proxy) o;

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
