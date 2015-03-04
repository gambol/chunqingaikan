package cn.dm.android.d; class a { void a() { int a;
a=0;// .class public Lcn/dm/android/d/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:I = 0x33dcf4
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/content/Context;
a=0;// 
a=0;// .field private c:Landroid/app/NotificationManager;
a=0;// 
a=0;// .field private d:Lcn/dm/a/a;
a=0;// 
a=0;// .field private e:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/lang/ref/SoftReference",
a=0;//             "<",
a=0;//             "Landroid/app/Notification;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcn/dm/android/d/a;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcn/dm/android/d/a;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 42
a=0;//     iput-object p1, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/dm/a/a;->a(Landroid/content/Context;)Lcn/dm/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/d/a;->d:Lcn/dm/a/a;
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcn/dm/android/d/a;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/d/a;->c:Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private e()Landroid/app/PendingIntent;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 154
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v1, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/high16 v3, 0x8000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 162
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(J)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     const-wide/32 v0, 0x33dcf4
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     add-long/2addr v0, p1
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(ILjava/lang/String;)Landroid/app/Notification;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/ref/SoftReference;
a=0;// 
a=0;//     .line 106
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/Notification;
a=0;// 
a=0;//     .line 108
a=0;//     :goto_0
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v1, Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification;);
a=0;//     invoke-direct {v1}, Landroid/app/Notification;-><init>()V
a=0;// 
a=0;//     .line 114
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     const v2, 0x1080081
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     .line 115
a=0;//     iput-object p2, v1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 116
a=0;//     invoke-direct {p0}, Lcn/dm/android/d/a;->e()Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 117
a=0;//     #v2=(Reference,Landroid/app/PendingIntent;);
a=0;//     iget-object v3, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const-string v4, "\u6b63\u5728\u4e0b\u8f7d\uff0c\u8bf7\u7a0d\u5019..."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, p2, v4, v2}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/ref/SoftReference;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/ref/SoftReference;);
a=0;//     invoke-direct {v3, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/ref/SoftReference;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 126
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v1, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 140
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 137
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 138
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     .line 140
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/dm/a/a/a;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->k()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/dm/android/d/a;->a(J)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 56
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/dm/android/d/a;->a(ILjava/lang/String;)Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v2, p0, Lcn/dm/android/d/a;->c:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     .line 191
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     invoke-virtual {p0, p1, p2}, Lcn/dm/android/d/a;->a(J)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 200
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/dm/android/d/a;->c:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v1, p0, Lcn/dm/android/d/a;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcn/dm/a/a/a;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->k()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/dm/android/d/a;->a(J)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 76
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/dm/android/d/a;->a(ILjava/lang/String;)Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v2, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "\u5df2\u7ecf\u4e0b\u8f7d"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {p1}, Lcn/dm/android/f/b;->a(Lcn/dm/a/a/a;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "%"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/dm/android/d/a;->e()Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v2, p0, Lcn/dm/android/d/a;->c:Landroid/app/NotificationManager;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->c:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->c:Landroid/app/NotificationManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V
a=0;// 
a=0;//     .line 211
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c(Lcn/dm/a/a/a;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->k()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/dm/android/d/a;->a(J)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 172
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/dm/android/d/a;->d:Lcn/dm/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/a/a;);
a=0;//     invoke-virtual {v1, p1}, Lcn/dm/a/a;->h(Lcn/dm/a/a/a;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 173
a=0;//     invoke-static {v1}, Lcn/dm/android/f/b;->a(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v2, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/high16 v4, 0x8000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 176
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v0, v2}, Lcn/dm/android/d/a;->a(ILjava/lang/String;)Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 179
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iput-wide v3, v2, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     .line 180
a=0;//     iput-object v1, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v3, p0, Lcn/dm/android/d/a;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p1}, Lcn/dm/a/a/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u4e0b\u8f7d\u5b8c\u6210,\u70b9\u51fb\u5b89\u88c5"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4, v5, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v1, p0, Lcn/dm/android/d/a;->c:Landroid/app/NotificationManager;
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 184
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 217
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 219
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 221
a=0;//     #v3=(Reference,Ljava/util/Iterator;);
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v4, v0, [I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 223
a=0;//     :goto_0
a=0;//     #v1=(Integer);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 224
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 225
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 226
a=0;//     #v0=(Integer);
a=0;//     aput v0, v4, v1
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v5, p0, Lcn/dm/android/d/a;->c:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-virtual {v5, v0}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 228
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 229
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 231
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v5=(Conflicted);
a=0;//     array-length v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v0, p0, Lcn/dm/android/d/a;->e:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     aget v1, v4, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 231
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 234
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
