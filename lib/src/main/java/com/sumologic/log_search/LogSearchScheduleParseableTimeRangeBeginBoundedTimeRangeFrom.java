package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.087Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom.Jsii$Proxy.class)
public interface LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom extends software.amazon.jsii.JsiiSerializable {

    /**
     * epoch_time_range block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#epoch_time_range LogSearch#epoch_time_range}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromEpochTimeRange getEpochTimeRange() {
        return null;
    }

    /**
     * iso8601_time_range block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#iso8601_time_range LogSearch#iso8601_time_range}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange getIso8601TimeRange() {
        return null;
    }

    /**
     * literal_time_range block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#literal_time_range LogSearch#literal_time_range}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange getLiteralTimeRange() {
        return null;
    }

    /**
     * relative_time_range block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#relative_time_range LogSearch#relative_time_range}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange getRelativeTimeRange() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom> {
        com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromEpochTimeRange epochTimeRange;
        com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange iso8601TimeRange;
        com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange literalTimeRange;
        com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange relativeTimeRange;

        /**
         * Sets the value of {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom#getEpochTimeRange}
         * @param epochTimeRange epoch_time_range block.
         *                       Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#epoch_time_range LogSearch#epoch_time_range}
         * @return {@code this}
         */
        public Builder epochTimeRange(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromEpochTimeRange epochTimeRange) {
            this.epochTimeRange = epochTimeRange;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom#getIso8601TimeRange}
         * @param iso8601TimeRange iso8601_time_range block.
         *                         Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#iso8601_time_range LogSearch#iso8601_time_range}
         * @return {@code this}
         */
        public Builder iso8601TimeRange(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange iso8601TimeRange) {
            this.iso8601TimeRange = iso8601TimeRange;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom#getLiteralTimeRange}
         * @param literalTimeRange literal_time_range block.
         *                         Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#literal_time_range LogSearch#literal_time_range}
         * @return {@code this}
         */
        public Builder literalTimeRange(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange literalTimeRange) {
            this.literalTimeRange = literalTimeRange;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom#getRelativeTimeRange}
         * @param relativeTimeRange relative_time_range block.
         *                          Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#relative_time_range LogSearch#relative_time_range}
         * @return {@code this}
         */
        public Builder relativeTimeRange(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange relativeTimeRange) {
            this.relativeTimeRange = relativeTimeRange;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom {
        private final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromEpochTimeRange epochTimeRange;
        private final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange iso8601TimeRange;
        private final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange literalTimeRange;
        private final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange relativeTimeRange;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.epochTimeRange = software.amazon.jsii.Kernel.get(this, "epochTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromEpochTimeRange.class));
            this.iso8601TimeRange = software.amazon.jsii.Kernel.get(this, "iso8601TimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange.class));
            this.literalTimeRange = software.amazon.jsii.Kernel.get(this, "literalTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange.class));
            this.relativeTimeRange = software.amazon.jsii.Kernel.get(this, "relativeTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.epochTimeRange = builder.epochTimeRange;
            this.iso8601TimeRange = builder.iso8601TimeRange;
            this.literalTimeRange = builder.literalTimeRange;
            this.relativeTimeRange = builder.relativeTimeRange;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromEpochTimeRange getEpochTimeRange() {
            return this.epochTimeRange;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromIso8601TimeRange getIso8601TimeRange() {
            return this.iso8601TimeRange;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromLiteralTimeRange getLiteralTimeRange() {
            return this.literalTimeRange;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFromRelativeTimeRange getRelativeTimeRange() {
            return this.relativeTimeRange;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEpochTimeRange() != null) {
                data.set("epochTimeRange", om.valueToTree(this.getEpochTimeRange()));
            }
            if (this.getIso8601TimeRange() != null) {
                data.set("iso8601TimeRange", om.valueToTree(this.getIso8601TimeRange()));
            }
            if (this.getLiteralTimeRange() != null) {
                data.set("literalTimeRange", om.valueToTree(this.getLiteralTimeRange()));
            }
            if (this.getRelativeTimeRange() != null) {
                data.set("relativeTimeRange", om.valueToTree(this.getRelativeTimeRange()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom.Jsii$Proxy that = (LogSearchScheduleParseableTimeRangeBeginBoundedTimeRangeFrom.Jsii$Proxy) o;

            if (this.epochTimeRange != null ? !this.epochTimeRange.equals(that.epochTimeRange) : that.epochTimeRange != null) return false;
            if (this.iso8601TimeRange != null ? !this.iso8601TimeRange.equals(that.iso8601TimeRange) : that.iso8601TimeRange != null) return false;
            if (this.literalTimeRange != null ? !this.literalTimeRange.equals(that.literalTimeRange) : that.literalTimeRange != null) return false;
            return this.relativeTimeRange != null ? this.relativeTimeRange.equals(that.relativeTimeRange) : that.relativeTimeRange == null;
        }

        @Override
        public final int hashCode() {
            int result = this.epochTimeRange != null ? this.epochTimeRange.hashCode() : 0;
            result = 31 * result + (this.iso8601TimeRange != null ? this.iso8601TimeRange.hashCode() : 0);
            result = 31 * result + (this.literalTimeRange != null ? this.literalTimeRange.hashCode() : 0);
            result = 31 * result + (this.relativeTimeRange != null ? this.relativeTimeRange.hashCode() : 0);
            return result;
        }
    }
}
