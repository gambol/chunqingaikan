.class public Lnet/youmi/android/a/b/c/c;
.super Ljava/lang/Object;


# direct methods
.method public static a([BLjava/lang/String;I)[B
    .locals 2

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    :try_start_0
    invoke-static {p0, p1}, Lnet/youmi/android/a/b/d/f;->a([BLjava/lang/String;)[B

    move-result-object p0

    :goto_0
    :pswitch_0
    return-object p0

    :pswitch_1
    invoke-static {p0, p1}, Lnet/youmi/android/a/b/d/f;->a([BLjava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object p0, v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static b([BLjava/lang/String;I)[B
    .locals 2

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    :try_start_0
    invoke-static {p0, p1}, Lnet/youmi/android/a/b/d/f;->b([BLjava/lang/String;)[B

    move-result-object p0

    :goto_0
    :pswitch_0
    return-object p0

    :pswitch_1
    invoke-static {p0, p1}, Lnet/youmi/android/a/b/d/f;->b([BLjava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object p0, v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
