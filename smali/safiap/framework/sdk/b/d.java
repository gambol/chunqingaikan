package safiap.framework.sdk.b; class d { void a() { int a;
a=0;// .class public final Lsafiap/framework/sdk/b/d;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lsafiap/framework/util/MyLogger; = null
a=0;// 
a=0;// .field private static final b:Ljava/lang/String; = "PackageUtil"
a=0;// 
a=0;// .field private static final c:Ljava/lang/String; = "package:"
a=0;// 
a=0;// .field private static d:I = 0x0
a=0;// 
a=0;// .field private static e:Ljava/lang/String; = "/.SAF/update/"
a=0;// 
a=0;// .field private static f:I = 0x2710
a=0;// 
a=0;// .field private static g:I = 0x4e20
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     const-string v0, "PackageUtil"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/sdk/b/d;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/sdk/b/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 97
a=0;//     #v2=(Null);
a=0;//     sget-object v0, Lsafiap/framework/sdk/b/d;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "getMyFrameworkVersionCode...."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 100
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 103
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/pm/ServiceInfo;);
a=0;//     iget-object v5, v5, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 107
a=0;//     iget v2, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     .line 108
a=0;//     #v2=(Integer);
a=0;//     sget-object v0, Lsafiap/framework/sdk/b/d;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "MyFV:"
a=0;// 
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);v1=(Integer);v2=(Null);v4=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 58
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     const-string v2, "mounted"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const-string v3, "/.SAF/update/"
a=0;// 
a=0;//     invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(UninitRef,Ljava/io/File;);
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Z)Ljava/io/File;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     const-string v0, "mounted"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/.SAF/update/"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 80
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 204
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Lsafiap/framework/sdk/b/d;->e(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 205
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 208
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 209
a=0;//     #v3=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v4, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v1, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     invoke-virtual {v2, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 212
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 213
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v2, "PackageUtil"
a=0;// 
a=0;//     const-string v3, "SAF-A Exception:512002"
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 214
a=0;//     invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 172
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Lsafiap/framework/sdk/b/d;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "in getNameByAction actionName:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 173
a=0;//     const-string v3, "unKnown"
a=0;// 
a=0;//     .line 175
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 177
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 178
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 179
a=0;//     #v4=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v4, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 180
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 199
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);v2=(Conflicted);v5=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Null);v2=(Reference,Landroid/content/Intent;);v5=(Uninit);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 184
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);v1=(Integer);v2=(Integer);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v2, v5, :cond_2
a=0;// 
a=0;//     .line 185
a=0;//     invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 186
a=0;//     iget v5, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 187
a=0;//     iget v5, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     if-ge v1, v5, :cond_1
a=0;// 
a=0;//     .line 188
a=0;//     iget v1, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     .line 184
a=0;//     :cond_1
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 192
a=0;//     :cond_2
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 193
a=0;//     const/16 v1, 0x2710
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne p2, v1, :cond_3
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v0, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 199
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 195
a=0;//     :cond_3
a=0;//     #v1=(PosShort);
a=0;//     const/16 v1, 0x4e20
a=0;// 
a=0;//     if-ne p2, v1, :cond_4
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v0, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 336
a=0;//     const-string v0, "apk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lsafiap/framework/sdk/b/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 327
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 322
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 323
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 326
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 327
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;IILandroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 410
a=0;//     const-string v0, "notification"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 411
a=0;//     invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 413
a=0;//     if-lez p2, :cond_0
a=0;// 
a=0;//     .line 414
a=0;//     new-instance v1, Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification;);
a=0;//     const v2, 0x108000a
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-direct {v1, v2, p6, v3, v4}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     .line 415
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/high16 v4, 0x10000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p0, v2, v3, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 416
a=0;//     #v2=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v1, p0, p5, p7, v2}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 417
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     .line 418
a=0;//     invoke-virtual {v0, p2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 420
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/io/File;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 316
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 312
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 313
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 314
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 315
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     .line 133
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 134
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 137
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v2, v1, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 138
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 159
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Reference,Landroid/content/pm/PackageManager;);v3=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 143
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);v3=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     .line 144
a=0;//     invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 146
a=0;//     iget v6, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v2, v6, :cond_2
a=0;// 
a=0;//     .line 147
a=0;//     iget v2, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     .line 149
a=0;//     :cond_2
a=0;//     sget-object v0, Lsafiap/framework/sdk/b/d;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "isComponentsInstalled().actionName:"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ",maxPriorityValue:"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ",version:"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 143
a=0;//     :cond_3
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 382
a=0;//     .line 383
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 385
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 387
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 388
a=0;//     iget-object v3, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/pm/ServiceInfo;);
a=0;//     iget-object v3, v3, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 389
a=0;//     iget-object v0, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     iget-object v4, v0, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 391
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->IAP_COMPONENT_PACKAGE_NAME:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_NAME:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 393
a=0;//     const-string v0, "activity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     .line 394
a=0;//     const v3, 0x7fffffff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Landroid/app/ActivityManager;->getRunningServices(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningServiceInfo;
a=0;// 
a=0;//     .line 395
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningServiceInfo;->service:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 396
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 383
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 404
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/util/Iterator;);v3=(Reference,Ljava/util/Iterator;);v4=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/File;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 438
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 441
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 439
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 441
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;Ljava/lang/String;)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Lsafiap/framework/sdk/b/d;->e(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 229
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 234
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 235
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v3, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 236
a=0;//     iget v0, v2, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 242
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 238
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 239
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v2, "PackageUtil"
a=0;// 
a=0;//     const-string v3, "SAF-A Exception:512003"
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 240
a=0;//     invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     const-string v0, "tmp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lsafiap/framework/sdk/b/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p0, v0, v1}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 64
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 65
a=0;//     :catch_0
a=0;//     #v1=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 66
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 345
a=0;//     const-string v0, "tmp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lsafiap/framework/sdk/b/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/content/pm/ResolveInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 367
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 374
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 369
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 370
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 371
a=0;//     invoke-virtual {v0, p2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 372
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 373
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 425
a=0;//     invoke-static {p0}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 427
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x384
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 428
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 433
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 430
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(PosShort);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v1, "PackageUtil"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "SAF Framework service version is: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " and is NOT right!"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 431
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     invoke-static {p1}, Lsafiap/framework/sdk/b/d;->e(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 254
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 256
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 259
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 260
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v3, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 261
a=0;//     iget-object v0, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 267
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 263
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 264
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v2, "PackageUtil"
a=0;// 
a=0;//     const-string v3, "SAF-A Exception:512003"
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 265
a=0;//     invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 349
a=0;//     const-string v0, "patch"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lsafiap/framework/sdk/b/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     invoke-static {p0, p1, p2}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Boolean);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Landroid/content/Context;Ljava/lang/String;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 279
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lsafiap/framework/sdk/b/d;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getComponentsVersion().actionName:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 283
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 284
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 285
a=0;//     invoke-virtual {v2, v1, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 286
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 299
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(Reference,Landroid/content/pm/PackageManager;);v4=(Uninit);v5=(Uninit);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 290
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     .line 291
a=0;//     invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 293
a=0;//     iget v4, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v1, v4, :cond_3
a=0;// 
a=0;//     .line 294
a=0;//     iget v0, v0, Landroid/content/pm/ResolveInfo;->priority:I
a=0;// 
a=0;//     .line 296
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Lsafiap/framework/sdk/b/d;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "getComponentsVersion and MaxPV:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 290
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);v4=(Integer);v5=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static d(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 359
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 362
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     const-string v1, ".apk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v1, ".patch"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static e(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 124
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "package:"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
