.class Lnet/youmi/android/offers/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lnet/youmi/android/offers/OffersManager;


# direct methods
.method constructor <init>(Lnet/youmi/android/offers/OffersManager;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/offers/a;->b:Lnet/youmi/android/offers/OffersManager;

    iput-object p2, p0, Lnet/youmi/android/offers/a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/a;->b:Lnet/youmi/android/offers/OffersManager;

    invoke-static {v0}, Lnet/youmi/android/offers/OffersManager;->a(Lnet/youmi/android/offers/OffersManager;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/offers/a;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/c/a;->c(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
