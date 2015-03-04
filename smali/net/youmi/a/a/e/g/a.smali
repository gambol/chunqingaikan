.class public Lnet/youmi/android/a/a/e/g/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Lnet/youmi/android/a/a/a/a/a;

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:J

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Z

.field private j:Lnet/youmi/android/a/a/e/g/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/a/e/g/a;->i:Z

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lnet/youmi/android/a/a/e/g/a;->f:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/e/g/a;->b:I

    return-void
.end method

.method public a(J)V
    .locals 1

    iput-wide p1, p0, Lnet/youmi/android/a/a/e/g/a;->f:J

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/g/a;->c:Ljava/lang/String;

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/a/a/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/g/a;->a:Lnet/youmi/android/a/a/a/a/a;

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/e/g/b;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/g/a;->j:Lnet/youmi/android/a/a/e/g/b;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/a/a/e/g/a;->h:Z

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/g/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/g/a;->d:Ljava/lang/String;

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/a/a/e/g/a;->i:Z

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/g/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/g/a;->e:Ljava/lang/String;

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/g/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/g/a;->g:Ljava/lang/String;

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/e/g/a;->h:Z

    return v0
.end method

.method public f()Lnet/youmi/android/a/a/a/a/a;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/g/a;->a:Lnet/youmi/android/a/a/a/a/a;

    return-object v0
.end method

.method public g()Lnet/youmi/android/a/a/e/g/b;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/g/a;->j:Lnet/youmi/android/a/a/e/g/b;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/e/g/a;->i:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JsModel_AppItem [\n  mAppInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/g/a;->a:Lnet/youmi/android/a/a/a/a/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " \n  mSourceProductID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lnet/youmi/android/a/a/e/g/a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \n  mStartUriAfterInstall="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/g/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \n  mAlertTipsAfterInstall_BeforeStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/g/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \n  mAlertTipsBeforeInstall="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/g/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \n  mRequiredExperienceTime_ms="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lnet/youmi/android/a/a/e/g/a;->f:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " \n  mParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/g/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnet/youmi/android/a/a/e/g/a;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " \n  mIsCreateShortCut_AfterInstall="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnet/youmi/android/a/a/e/g/a;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " \n  mGwParam="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/g/a;->j:Lnet/youmi/android/a/a/e/g/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
