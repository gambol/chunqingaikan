.class public Lnet/youmi/android/a/a/c;
.super Lnet/youmi/android/a/a/a;


# static fields
.field protected static a:I

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;

.field private static e:Ljava/lang/String;

.field private static f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    sput v0, Lnet/youmi/android/a/a/c;->a:I

    return-void
.end method

.method public static a(I)V
    .locals 0

    sput p0, Lnet/youmi/android/a/a/c;->a:I

    return-void
.end method

.method public static final b()Ljava/lang/String;
    .locals 3

    sget-object v0, Lnet/youmi/android/a/a/c;->b:Ljava/lang/String;

    const-string v1, "0a4144490c4b1b441603124a5f42484d09115d5b4c0a00401d17554d0d590b16"

    const-string v2, "0a4144490c4b1b500e0d0405541b1f4d0714591c0c01111b411507164b41514d0d575c17"

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/a/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget v0, Lnet/youmi/android/a/a/c;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "androidurl"

    invoke-static {p0, p1, v0}, Lnet/youmi/android/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "androidurl"

    invoke-static {p0, p2, v0}, Lnet/youmi/android/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "androidurl"

    invoke-static {p0, p1, v0}, Lnet/youmi/android/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    const-string v0, "androidurl"

    invoke-static {p0, p2, v0}, Lnet/youmi/android/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    const-string v0, "androidurl"

    invoke-static {p0, p1, v0}, Lnet/youmi/android/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static final c()Ljava/lang/String;
    .locals 3

    sget-object v0, Lnet/youmi/android/a/a/c;->c:Ljava/lang/String;

    const-string v1, "0a4144490c4b1b441603124a5f42484d09115d5b4c0a00401d0009114b41514d145746"

    const-string v2, "0a4144490c4b1b500e0d0405541b1f4d0714591c0c01111b411507164b560d114b4f064c155a46"

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/a/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final d()Ljava/lang/String;
    .locals 3

    sget-object v0, Lnet/youmi/android/a/a/c;->d:Ljava/lang/String;

    const-string v1, "0a4144490c4b1b431003050f16510b44481d5f470f0d4b5a571549145518030c004b5a0a011b45005b5b00575612"

    const-string v2, "0a4144490c4b1b431003050f16510b44481d5f470f0d4b5a571549145518030c004b5a0a011b45005b5b00575612"

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/a/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final e()Ljava/lang/String;
    .locals 3

    sget-object v0, Lnet/youmi/android/a/a/c;->e:Ljava/lang/String;

    const-string v1, "0a4144490c4b1b441603124a5f42484d09115d5b4c0a00401d121203101814514b5a5a0d03"

    const-string v2, "0a4144490c4b1b500e0d0405541b1f4d0714591c0c01111b411507164b41514d07565b05"

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/a/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final f()Ljava/lang/String;
    .locals 3

    sget-object v0, Lnet/youmi/android/a/a/c;->f:Ljava/lang/String;

    const-string v1, "0a4144490c4b1b441603124a5f42484d09115d5b4c0a00401d0016124b41514d005c433c104451004c55"

    const-string v2, "0a4144490c4b1b500e0d0405541b1f4d0714591c0c01111b411507164b41514d005c433c104451004c55"

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/a/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
