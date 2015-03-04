.class public final enum Lnet/youmi/android/a/a/e/a;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lnet/youmi/android/a/a/e/a;

.field public static final enum b:Lnet/youmi/android/a/a/e/a;

.field public static final enum c:Lnet/youmi/android/a/a/e/a;

.field private static final synthetic d:[Lnet/youmi/android/a/a/e/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lnet/youmi/android/a/a/e/a;

    const-string v1, "UnSupport"

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/a/a/e/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    new-instance v0, Lnet/youmi/android/a/a/e/a;

    const-string v1, "Success"

    invoke-direct {v0, v1, v3}, Lnet/youmi/android/a/a/e/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    new-instance v0, Lnet/youmi/android/a/a/e/a;

    const-string v1, "Exception"

    invoke-direct {v0, v1, v4}, Lnet/youmi/android/a/a/e/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    const/4 v0, 0x3

    new-array v0, v0, [Lnet/youmi/android/a/a/e/a;

    sget-object v1, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    aput-object v1, v0, v2

    sget-object v1, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    aput-object v1, v0, v3

    sget-object v1, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    aput-object v1, v0, v4

    sput-object v0, Lnet/youmi/android/a/a/e/a;->d:[Lnet/youmi/android/a/a/e/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/youmi/android/a/a/e/a;
    .locals 1

    const-class v0, Lnet/youmi/android/a/a/e/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/e/a;

    return-object v0
.end method

.method public static values()[Lnet/youmi/android/a/a/e/a;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/e/a;->d:[Lnet/youmi/android/a/a/e/a;

    invoke-virtual {v0}, [Lnet/youmi/android/a/a/e/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/youmi/android/a/a/e/a;

    return-object v0
.end method
