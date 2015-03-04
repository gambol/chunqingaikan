.class Lnet/youmi/android/spot/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lnet/youmi/android/spot/SpotDialogListener;

.field final synthetic c:Z

.field final synthetic d:Lnet/youmi/android/spot/SpotManager;


# direct methods
.method constructor <init>(Lnet/youmi/android/spot/SpotManager;ZLnet/youmi/android/spot/SpotDialogListener;Z)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/m;->d:Lnet/youmi/android/spot/SpotManager;

    iput-boolean p2, p0, Lnet/youmi/android/spot/m;->a:Z

    iput-object p3, p0, Lnet/youmi/android/spot/m;->b:Lnet/youmi/android/spot/SpotDialogListener;

    iput-boolean p4, p0, Lnet/youmi/android/spot/m;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    new-instance v0, Lnet/youmi/android/spot/k;

    iget-object v1, p0, Lnet/youmi/android/spot/m;->d:Lnet/youmi/android/spot/SpotManager;

    iget-object v2, p0, Lnet/youmi/android/spot/m;->d:Lnet/youmi/android/spot/SpotManager;

    invoke-static {v2}, Lnet/youmi/android/spot/SpotManager;->a(Lnet/youmi/android/spot/SpotManager;)Landroid/content/Context;

    move-result-object v2

    iget-boolean v3, p0, Lnet/youmi/android/spot/m;->a:Z

    iget-object v4, p0, Lnet/youmi/android/spot/m;->b:Lnet/youmi/android/spot/SpotDialogListener;

    iget-boolean v5, p0, Lnet/youmi/android/spot/m;->c:Z

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/spot/k;-><init>(Lnet/youmi/android/spot/SpotManager;Landroid/content/Context;ZLnet/youmi/android/spot/SpotDialogListener;Z)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lnet/youmi/android/spot/k;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
