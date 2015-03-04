.class public Lnet/youmi/android/spot/k;
.super Landroid/os/AsyncTask;


# instance fields
.field a:Z

.field b:Landroid/content/Context;

.field c:Lnet/youmi/android/spot/SpotManager;

.field d:Lnet/youmi/android/spot/SpotDialogListener;

.field e:Z


# direct methods
.method constructor <init>(Lnet/youmi/android/spot/SpotManager;Landroid/content/Context;ZLnet/youmi/android/spot/SpotDialogListener;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-boolean v0, p0, Lnet/youmi/android/spot/k;->a:Z

    iput-boolean v0, p0, Lnet/youmi/android/spot/k;->e:Z

    iput-object p1, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    iput-object p2, p0, Lnet/youmi/android/spot/k;->b:Landroid/content/Context;

    iput-boolean p3, p0, Lnet/youmi/android/spot/k;->a:Z

    iput-object p4, p0, Lnet/youmi/android/spot/k;->d:Lnet/youmi/android/spot/SpotDialogListener;

    iput-boolean p5, p0, Lnet/youmi/android/spot/k;->e:Z

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/String;
    .locals 7

    const/4 v6, 0x0

    const-string v0, ""

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lnet/youmi/android/spot/SpotManager;->setLoading(Z)V

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "scid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/spot/k;->b:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/a/c/c/a;->h(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/spot/k;->b:Landroid/content/Context;

    iget-boolean v3, p0, Lnet/youmi/android/spot/k;->e:Z

    invoke-static {v2, v1, v3}, Lnet/youmi/android/c/a/b;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lnet/youmi/android/spot/k;->e:Z

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x14

    if-ge v1, v2, :cond_2

    :cond_1
    const-string v1, "SDKChecking"

    const-string v2, "ad resource request failed"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "c"

    const/4 v3, -0x1

    invoke-static {v1, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v1

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    if-nez v1, :cond_4

    const-string v1, "Ad request succeed"

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    iget-object v1, p0, Lnet/youmi/android/spot/k;->b:Landroid/content/Context;

    sget-object v2, Lnet/youmi/android/spot/SpotManager;->d:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "lastRequestTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v1, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    iget-object v2, p0, Lnet/youmi/android/spot/k;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lnet/youmi/android/spot/SpotManager;->a(Landroid/content/Context;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v1, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    invoke-virtual {v1, v6}, Lnet/youmi/android/spot/SpotManager;->setLoading(Z)V

    :cond_3
    return-object v0

    :cond_4
    :try_start_1
    invoke-static {v1}, Lnet/youmi/android/c/a/f;->a(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Ad request result code:%d, %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    invoke-static {v3, v4}, Lnet/youmi/android/a/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/spot/k;->d:Lnet/youmi/android/spot/SpotDialogListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/k;->d:Lnet/youmi/android/spot/SpotDialogListener;

    invoke-interface {v0}, Lnet/youmi/android/spot/SpotDialogListener;->onShowFailed()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    iput-object p1, v0, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    iget-boolean v0, p0, Lnet/youmi/android/spot/k;->a:Z

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lnet/youmi/android/spot/SpotManager;->a(I)Z

    iget-object v0, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    iget-object v1, p0, Lnet/youmi/android/spot/k;->b:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/spot/k;->d:Lnet/youmi/android/spot/SpotDialogListener;

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/spot/SpotManager;->a(Landroid/content/Context;Lnet/youmi/android/spot/SpotDialogListener;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/k;->c:Lnet/youmi/android/spot/SpotManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnet/youmi/android/spot/SpotManager;->setLoading(Z)V

    :cond_0
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onCancelled(Ljava/lang/Object;)V

    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lnet/youmi/android/spot/k;->a([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lnet/youmi/android/spot/k;->b(Ljava/lang/String;)V

    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lnet/youmi/android/spot/k;->a(Ljava/lang/String;)V

    return-void
.end method
