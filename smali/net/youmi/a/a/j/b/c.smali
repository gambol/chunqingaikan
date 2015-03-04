.class public final enum Lnet/youmi/android/a/a/j/b/c;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lnet/youmi/android/a/a/j/b/c;

.field public static final enum b:Lnet/youmi/android/a/a/j/b/c;

.field public static final enum c:Lnet/youmi/android/a/a/j/b/c;

.field public static final enum d:Lnet/youmi/android/a/a/j/b/c;

.field private static final synthetic e:[Lnet/youmi/android/a/a/j/b/c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lnet/youmi/android/a/a/j/b/c;

    const-string v1, "RESET"

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/a/a/j/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/j/b/c;->a:Lnet/youmi/android/a/a/j/b/c;

    new-instance v0, Lnet/youmi/android/a/a/j/b/c;

    const-string v1, "PULL_TO_REFRESH"

    invoke-direct {v0, v1, v3}, Lnet/youmi/android/a/a/j/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/j/b/c;->b:Lnet/youmi/android/a/a/j/b/c;

    new-instance v0, Lnet/youmi/android/a/a/j/b/c;

    const-string v1, "RELEASE_TO_REFRESH"

    invoke-direct {v0, v1, v4}, Lnet/youmi/android/a/a/j/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/j/b/c;->c:Lnet/youmi/android/a/a/j/b/c;

    new-instance v0, Lnet/youmi/android/a/a/j/b/c;

    const-string v1, "REFRESHING"

    invoke-direct {v0, v1, v5}, Lnet/youmi/android/a/a/j/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/youmi/android/a/a/j/b/c;->d:Lnet/youmi/android/a/a/j/b/c;

    const/4 v0, 0x4

    new-array v0, v0, [Lnet/youmi/android/a/a/j/b/c;

    sget-object v1, Lnet/youmi/android/a/a/j/b/c;->a:Lnet/youmi/android/a/a/j/b/c;

    aput-object v1, v0, v2

    sget-object v1, Lnet/youmi/android/a/a/j/b/c;->b:Lnet/youmi/android/a/a/j/b/c;

    aput-object v1, v0, v3

    sget-object v1, Lnet/youmi/android/a/a/j/b/c;->c:Lnet/youmi/android/a/a/j/b/c;

    aput-object v1, v0, v4

    sget-object v1, Lnet/youmi/android/a/a/j/b/c;->d:Lnet/youmi/android/a/a/j/b/c;

    aput-object v1, v0, v5

    sput-object v0, Lnet/youmi/android/a/a/j/b/c;->e:[Lnet/youmi/android/a/a/j/b/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/youmi/android/a/a/j/b/c;
    .locals 1

    const-class v0, Lnet/youmi/android/a/a/j/b/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/j/b/c;

    return-object v0
.end method

.method public static values()[Lnet/youmi/android/a/a/j/b/c;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/j/b/c;->e:[Lnet/youmi/android/a/a/j/b/c;

    invoke-virtual {v0}, [Lnet/youmi/android/a/a/j/b/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/youmi/android/a/a/j/b/c;

    return-object v0
.end method
