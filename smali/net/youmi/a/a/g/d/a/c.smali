.class Lnet/youmi/android/a/a/g/d/a/c;
.super Landroid/database/sqlite/SQLiteOpenHelper;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "create table if not exists %s (_id integer primary key autoincrement, %s varchar, %s text UNIQUE, %s varchar, %s varchar, %s varchar, %s varchar, %s varchar, %s varchar)"

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "Exj23LdkF"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "a"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "b"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "c"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "d"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "e"

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string v3, "f"

    aput-object v3, v1, v2

    const/4 v2, 0x7

    const-string v3, "g"

    aput-object v3, v1, v2

    const/16 v2, 0x8

    const-string v3, "h"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/a/g/d/a/c;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-static {p1}, Lnet/youmi/android/a/a/g/d/a/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method

.method private static final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, "E9xSkldfF"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/g/d/a/c;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS Exj23LdkF"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lnet/youmi/android/a/a/g/d/a/c;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method
