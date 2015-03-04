.class public Lnet/youmi/android/a/a/a/a/f;
.super Ljava/lang/Object;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:I

.field private h:J


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->a:Z

    iput-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->b:Z

    iput-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->c:Z

    iput-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->d:Z

    iput-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->e:Z

    iput-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->f:Z

    const/4 v0, -0x1

    iput v0, p0, Lnet/youmi/android/a/a/a/a/f;->g:I

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    iput-wide p1, p0, Lnet/youmi/android/a/a/a/a/f;->h:J

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/a/a/a/a/f;->c:Z

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->c:Z

    return v0
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    const/4 v1, 0x0

    const/4 v0, 0x1

    :try_start_0
    invoke-static {p1, p2}, Lnet/youmi/android/a/b/k/j;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    iput-boolean v3, p0, Lnet/youmi/android/a/a/a/a/f;->b:Z

    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v2, p0, Lnet/youmi/android/a/a/a/a/f;->g:I

    :goto_0
    const/4 v2, 0x1

    iput-boolean v2, p0, Lnet/youmi/android/a/a/a/a/f;->a:Z

    :goto_1
    return v0

    :cond_0
    const/4 v2, 0x0

    iput-boolean v2, p0, Lnet/youmi/android/a/a/a/a/f;->b:Z

    const/4 v2, -0x1

    iput v2, p0, Lnet/youmi/android/a/a/a/a/f;->g:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_1
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/a/a/a/a/f;->d:Z

    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->d:Z

    return v0
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/a/a/a/a/f;->f:Z

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->f:Z

    return v0
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/a/a/a/a/f;->e:Z

    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->e:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/a/a/f;->b:Z

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/a/a/f;->g:I

    return v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lnet/youmi/android/a/a/a/a/f;->h:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Model_App_Status [\n  mIsCheckInstallStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnet/youmi/android/a/a/a/a/f;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n  mIsInstalledInDevice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnet/youmi/android/a/a/a/a/f;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n  mIsServerHadInstallRecorded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnet/youmi/android/a/a/a/a/f;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n  mIsServerHadExperienceRecorded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnet/youmi/android/a/a/a/a/f;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n  mIsLocalHadAt3Record="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnet/youmi/android/a/a/a/a/f;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n  mIsLocalHadExperienceRecord="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnet/youmi/android/a/a/a/a/f;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n  mInstalledVersionCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lnet/youmi/android/a/a/a/a/f;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n  mUpdateTime_ms="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lnet/youmi/android/a/a/a/a/f;->h:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\n]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
