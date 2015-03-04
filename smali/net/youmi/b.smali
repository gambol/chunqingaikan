.class Lnet/youmi/android/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/AdBrowser;


# direct methods
.method constructor <init>(Lnet/youmi/android/AdBrowser;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/b;->a:Lnet/youmi/android/AdBrowser;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/b;->a:Lnet/youmi/android/AdBrowser;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/g/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/g/d;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/g/d;->b()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
