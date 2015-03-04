.class public Lnet/youmi/android/a/a/g/d/a/d;
.super Ljava/lang/Object;


# instance fields
.field public a:J

.field public b:Ljava/lang/String;

.field public c:I

.field public d:J

.field public e:J

.field public f:Ljava/lang/String;

.field public g:J

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v2, p0, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    iput-object v0, p0, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;

    iput-wide v2, p0, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    iput-object v0, p0, Lnet/youmi/android/a/a/g/d/a/d;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;IJ)V
    .locals 5

    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v2, p0, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    iput-object v0, p0, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;

    iput-wide v2, p0, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    iput-object v0, p0, Lnet/youmi/android/a/a/g/d/a/d;->h:Ljava/lang/String;

    iput-wide p1, p0, Lnet/youmi/android/a/a/g/d/a/d;->a:J

    iput-object p3, p0, Lnet/youmi/android/a/a/g/d/a/d;->b:Ljava/lang/String;

    iput p4, p0, Lnet/youmi/android/a/a/g/d/a/d;->c:I

    iput-wide p5, p0, Lnet/youmi/android/a/a/g/d/a/d;->d:J

    return-void
.end method


# virtual methods
.method a()Z
    .locals 4

    const-wide/16 v2, 0x0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/d;->b:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lnet/youmi/android/a/a/g/d/a/d;->c:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    iget-wide v0, p0, Lnet/youmi/android/a/a/g/d/a/d;->a:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lnet/youmi/android/a/a/g/d/a/d;->d:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lnet/youmi/android/a/a/g/d/a/d;->d:J

    iget-wide v2, p0, Lnet/youmi/android/a/a/g/d/a/d;->a:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EffRecordObject [mGenerateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lnet/youmi/android/a/a/g/d/a/d;->a:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mActionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lnet/youmi/android/a/a/g/d/a/d;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDeadline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lnet/youmi/android/a/a/g/d/a/d;->d:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mFinishTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mPreUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mIntervalTime_ms="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mPackageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/d;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
