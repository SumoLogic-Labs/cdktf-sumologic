package com.sumologic.muting_schedule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.138Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.mutingSchedule.MutingScheduleMonitor")
@software.amazon.jsii.Jsii.Proxy(MutingScheduleMonitor.Jsii$Proxy.class)
public interface MutingScheduleMonitor extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#all MutingSchedule#all}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAll() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#ids MutingSchedule#ids}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MutingScheduleMonitor}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MutingScheduleMonitor}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MutingScheduleMonitor> {
        java.lang.Object all;
        java.util.List<java.lang.String> ids;

        /**
         * Sets the value of {@link MutingScheduleMonitor#getAll}
         * @param all Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#all MutingSchedule#all}.
         * @return {@code this}
         */
        public Builder all(java.lang.Boolean all) {
            this.all = all;
            return this;
        }

        /**
         * Sets the value of {@link MutingScheduleMonitor#getAll}
         * @param all Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#all MutingSchedule#all}.
         * @return {@code this}
         */
        public Builder all(com.hashicorp.cdktf.IResolvable all) {
            this.all = all;
            return this;
        }

        /**
         * Sets the value of {@link MutingScheduleMonitor#getIds}
         * @param ids Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/muting_schedule#ids MutingSchedule#ids}.
         * @return {@code this}
         */
        public Builder ids(java.util.List<java.lang.String> ids) {
            this.ids = ids;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MutingScheduleMonitor}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MutingScheduleMonitor build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MutingScheduleMonitor}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MutingScheduleMonitor {
        private final java.lang.Object all;
        private final java.util.List<java.lang.String> ids;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.all = software.amazon.jsii.Kernel.get(this, "all", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.ids = software.amazon.jsii.Kernel.get(this, "ids", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.all = builder.all;
            this.ids = builder.ids;
        }

        @Override
        public final java.lang.Object getAll() {
            return this.all;
        }

        @Override
        public final java.util.List<java.lang.String> getIds() {
            return this.ids;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAll() != null) {
                data.set("all", om.valueToTree(this.getAll()));
            }
            if (this.getIds() != null) {
                data.set("ids", om.valueToTree(this.getIds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.mutingSchedule.MutingScheduleMonitor"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MutingScheduleMonitor.Jsii$Proxy that = (MutingScheduleMonitor.Jsii$Proxy) o;

            if (this.all != null ? !this.all.equals(that.all) : that.all != null) return false;
            return this.ids != null ? this.ids.equals(that.ids) : that.ids == null;
        }

        @Override
        public final int hashCode() {
            int result = this.all != null ? this.all.hashCode() : 0;
            result = 31 * result + (this.ids != null ? this.ids.hashCode() : 0);
            return result;
        }
    }
}
