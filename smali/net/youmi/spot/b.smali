.class Lnet/youmi/android/spot/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/spot/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/spot/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    iget-object v0, v0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->a(Lnet/youmi/android/spot/a;)Landroid/widget/ImageButton;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lnet/youmi/android/spot/a;->a(Lnet/youmi/android/spot/a;Z)Z

    iget-object v0, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    iget-object v0, v0, Lnet/youmi/android/spot/a;->b:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    invoke-static {v1}, Lnet/youmi/android/spot/a;->a(Lnet/youmi/android/spot/a;)Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->b(Lnet/youmi/android/spot/a;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->c(Lnet/youmi/android/spot/a;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    invoke-static {v1}, Lnet/youmi/android/spot/a;->a(Lnet/youmi/android/spot/a;)Landroid/widget/ImageButton;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    invoke-static {v0, v1, v2, v3}, Lnet/youmi/android/c/a/s;->c(Landroid/content/Context;Landroid/view/View;J)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    :goto_0
    :try_start_2
    iget-object v0, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->c(Lnet/youmi/android/spot/a;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lnet/youmi/android/spot/SpotManager;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lastShowTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lnet/youmi/android/spot/b;->a:Lnet/youmi/android/spot/a;

    invoke-virtual {v0}, Lnet/youmi/android/spot/a;->e()V

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method
