.class public Lnet/youmi/android/a/a/g/d/a/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lnet/youmi/android/a/a/g/d/a/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;I)V
    .locals 6

    const-wide/32 v4, 0x1499700

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;IJ)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;IJ)V
    .locals 8

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    new-array v3, v1, [I

    aput p3, v3, v0

    new-array v4, v1, [J

    aput-wide p4, v4, v0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, v5

    invoke-direct/range {v0 .. v6}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;[I[J[Ljava/lang/String;[J)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;[I)V
    .locals 7

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, v4

    move-object v6, v4

    invoke-direct/range {v0 .. v6}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;[I[J[Ljava/lang/String;[J)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;[I[J[Ljava/lang/String;[J)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnet/youmi/android/a/a/g/d/a/h;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lnet/youmi/android/a/a/g/d/a/h;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;[I[J[Ljava/lang/String;[J)V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/d/a/f;->a:Lnet/youmi/android/a/a/g/d/a/h;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/d/a/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnet/youmi/android/a/a/g/d/a/h;

    invoke-direct {v0, p1, p2}, Lnet/youmi/android/a/a/g/d/a/h;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/d/a/d;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/d/a/f;->a:Lnet/youmi/android/a/a/g/d/a/h;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/f;->a:Lnet/youmi/android/a/a/g/d/a/h;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/h;->a()V

    return-void
.end method
