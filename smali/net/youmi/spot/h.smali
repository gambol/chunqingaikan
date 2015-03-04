.class Lnet/youmi/android/spot/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/spot/SplashView;


# direct methods
.method constructor <init>(Lnet/youmi/android/spot/SplashView;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->f(Lnet/youmi/android/spot/SplashView;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->d(Lnet/youmi/android/spot/SplashView;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v1}, Lnet/youmi/android/spot/SplashView;->g(Lnet/youmi/android/spot/SplashView;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v2}, Lnet/youmi/android/spot/SplashView;->h(Lnet/youmi/android/spot/SplashView;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lnet/youmi/android/c/a/b;->a:Ljava/lang/String;

    const-wide/16 v4, -0x1

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lnet/youmi/android/spot/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    iget-object v0, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->i(Lnet/youmi/android/spot/SplashView;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v1}, Lnet/youmi/android/spot/SplashView;->d(Lnet/youmi/android/spot/SplashView;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v2}, Lnet/youmi/android/spot/SplashView;->i(Lnet/youmi/android/spot/SplashView;)Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v1}, Lnet/youmi/android/spot/SplashView;->d(Lnet/youmi/android/spot/SplashView;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->j(Lnet/youmi/android/spot/SplashView;)V

    iget-object v0, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->d(Lnet/youmi/android/spot/SplashView;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->k(Lnet/youmi/android/spot/SplashView;)Lnet/youmi/android/spot/SpotDialogListener;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->k(Lnet/youmi/android/spot/SplashView;)Lnet/youmi/android/spot/SpotDialogListener;

    move-result-object v0

    invoke-interface {v0}, Lnet/youmi/android/spot/SpotDialogListener;->onSpotClosed()V

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/spot/h;->a:Lnet/youmi/android/spot/SplashView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lnet/youmi/android/spot/SplashView;->a(Lnet/youmi/android/spot/SplashView;Z)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "ads_"

    invoke-static {v1, p0, v0}, Lnet/youmi/android/a/b/e/b;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
