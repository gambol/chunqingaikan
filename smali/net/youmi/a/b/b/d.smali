.class public Lnet/youmi/android/a/b/b/d;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Random;-><init>(J)V

    sput-object v0, Lnet/youmi/android/a/b/b/d;->a:Ljava/util/Random;

    return-void
.end method

.method public static final a(I)I
    .locals 1

    sget-object v0, Lnet/youmi/android/a/b/b/d;->a:Ljava/util/Random;

    invoke-virtual {v0, p0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    return v0
.end method
