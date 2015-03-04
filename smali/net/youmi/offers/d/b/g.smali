.class public Lnet/youmi/android/offers/d/b/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/offers/d/b/g;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/offers/d/b/g;->b:Ljava/lang/String;

    iput p3, p0, Lnet/youmi/android/offers/d/b/g;->c:I

    iput p4, p0, Lnet/youmi/android/offers/d/b/g;->d:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/b/g;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/d/b/g;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lnet/youmi/android/a/a/j/c/b;

    iget-object v1, p0, Lnet/youmi/android/offers/d/b/g;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lnet/youmi/android/a/a/j/c/b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lnet/youmi/android/offers/d/b/g;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/a/a/j/c/b;->b(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
