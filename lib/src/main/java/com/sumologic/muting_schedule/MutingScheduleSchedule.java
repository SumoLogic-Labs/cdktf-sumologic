package com.sumologic.muting_schedule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.138Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.mutingSchedule.MutingScheduleSchedule")
@software.amazon.jsii.Jsii.Proxy(MutingScheduleSchedule.Jsii$Proxy.class)
public interface MutingScheduleSchedule extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#duration MutingSchedule#duration}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getDuration();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#start_date MutingSchedule#start_date}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStartDate();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#start_time MutingSchedule#start_time}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStartTime();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#timezone MutingSchedule#timezone}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTimezone();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#rrule MutingSchedule#rrule}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRrule() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MutingScheduleSchedule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MutingScheduleSchedule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MutingScheduleSchedule> {
        java.lang.Number duration;
        java.lang.String startDate;
        java.lang.String startTime;
        java.lang.String timezone;
        java.lang.String rrule;

        /**
         * Sets the value of {@link MutingScheduleSchedule#getDuration}
         * @param duration Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#duration MutingSchedule#duration}. This parameter is required.
         * @return {@code this}
         */
        public Builder duration(java.lang.Number duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Sets the value of {@link MutingScheduleSchedule#getStartDate}
         * @param startDate Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#start_date MutingSchedule#start_date}. This parameter is required.
         * @return {@code this}
         */
        public Builder startDate(java.lang.String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Sets the value of {@link MutingScheduleSchedule#getStartTime}
         * @param startTime Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#start_time MutingSchedule#start_time}. This parameter is required.
         * @return {@code this}
         */
        public Builder startTime(java.lang.String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Sets the value of {@link MutingScheduleSchedule#getTimezone}
         * @param timezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#timezone MutingSchedule#timezone}. This parameter is required.
         * @return {@code this}
         */
        public Builder timezone(java.lang.String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Sets the value of {@link MutingScheduleSchedule#getRrule}
         * @param rrule Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#rrule MutingSchedule#rrule}.
         * @return {@code this}
         */
        public Builder rrule(java.lang.String rrule) {
            this.rrule = rrule;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MutingScheduleSchedule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MutingScheduleSchedule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MutingScheduleSchedule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MutingScheduleSchedule {
        private final java.lang.Number duration;
        private final java.lang.String startDate;
        private final java.lang.String startTime;
        private final java.lang.String timezone;
        private final java.lang.String rrule;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.duration = software.amazon.jsii.Kernel.get(this, "duration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.startDate = software.amazon.jsii.Kernel.get(this, "startDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.startTime = software.amazon.jsii.Kernel.get(this, "startTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timezone = software.amazon.jsii.Kernel.get(this, "timezone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rrule = software.amazon.jsii.Kernel.get(this, "rrule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.duration = java.util.Objects.requireNonNull(builder.duration, "duration is required");
            this.startDate = java.util.Objects.requireNonNull(builder.startDate, "startDate is required");
            this.startTime = java.util.Objects.requireNonNull(builder.startTime, "startTime is required");
            this.timezone = java.util.Objects.requireNonNull(builder.timezone, "timezone is required");
            this.rrule = builder.rrule;
        }

        @Override
        public final java.lang.Number getDuration() {
            return this.duration;
        }

        @Override
        public final java.lang.String getStartDate() {
            return this.startDate;
        }

        @Override
        public final java.lang.String getStartTime() {
            return this.startTime;
        }

        @Override
        public final java.lang.String getTimezone() {
            return this.timezone;
        }

        @Override
        public final java.lang.String getRrule() {
            return this.rrule;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("duration", om.valueToTree(this.getDuration()));
            data.set("startDate", om.valueToTree(this.getStartDate()));
            data.set("startTime", om.valueToTree(this.getStartTime()));
            data.set("timezone", om.valueToTree(this.getTimezone()));
            if (this.getRrule() != null) {
                data.set("rrule", om.valueToTree(this.getRrule()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.mutingSchedule.MutingScheduleSchedule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MutingScheduleSchedule.Jsii$Proxy that = (MutingScheduleSchedule.Jsii$Proxy) o;

            if (!duration.equals(that.duration)) return false;
            if (!startDate.equals(that.startDate)) return false;
            if (!startTime.equals(that.startTime)) return false;
            if (!timezone.equals(that.timezone)) return false;
            return this.rrule != null ? this.rrule.equals(that.rrule) : that.rrule == null;
        }

        @Override
        public final int hashCode() {
            int result = this.duration.hashCode();
            result = 31 * result + (this.startDate.hashCode());
            result = 31 * result + (this.startTime.hashCode());
            result = 31 * result + (this.timezone.hashCode());
            result = 31 * result + (this.rrule != null ? this.rrule.hashCode() : 0);
            return result;
        }
    }
}
