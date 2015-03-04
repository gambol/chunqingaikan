.class Lnet/youmi/android/spot/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/spot/SpotManager;


# direct methods
.method constructor <init>(Lnet/youmi/android/spot/SpotManager;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/n;->a:Lnet/youmi/android/spot/SpotManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/spot/n;->a:Lnet/youmi/android/spot/SpotManager;

    invoke-static {v0}, Lnet/youmi/android/spot/SpotManager;->b(Lnet/youmi/android/spot/SpotManager;)V

    return-void
.end method
