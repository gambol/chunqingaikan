package cn.dm.a; class h { void a() { int a;
a=0;// .class public Lcn/dm/a/h;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:I = 0x0
a=0;// 
a=0;// .field public static final b:I = 0x1
a=0;// 
a=0;// .field public static final c:I = 0x2
a=0;// 
a=0;// .field public static final d:I = 0x3
a=0;// 
a=0;// .field public static final e:I = 0x4
a=0;// 
a=0;// .field public static final f:I = 0x5
a=0;// 
a=0;// .field public static final g:I = 0x6
a=0;// 
a=0;// .field public static final h:I = 0x7
a=0;// 
a=0;// .field public static final i:I = 0x8
a=0;// 
a=0;// .field public static final j:I = 0x9
a=0;// 
a=0;// .field private static l:Lcn/dm/a/h;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private k:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcn/dm/a/c/a;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Lcn/dm/a/h;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcn/dm/a/h;->k:Ljava/util/List;
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lcn/dm/a/h;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     sget-object v0, Lcn/dm/a/h;->l:Lcn/dm/a/h;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/h;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Lcn/dm/a/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/a/h;);
a=0;//     invoke-direct {v0, p0}, Lcn/dm/a/h;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/h;);
a=0;//     sput-object v0, Lcn/dm/a/h;->l:Lcn/dm/a/h;
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/dm/a/h;->l:Lcn/dm/a/h;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(ILandroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 65
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "data"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/dm/a/a/a;
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v1, p0, Lcn/dm/a/h;->k:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcn/dm/a/c/a;
a=0;// 
a=0;//     .line 68
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 106
a=0;//     invoke-interface {v1, v0}, Lcn/dm/a/c/a;->onDownloadFailed(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :pswitch_0
a=0;//     invoke-interface {v1, v0}, Lcn/dm/a/c/a;->onProgressChange(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     :pswitch_1
a=0;//     invoke-interface {v1, v0}, Lcn/dm/a/c/a;->onDownloadStart(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     :pswitch_2
a=0;//     invoke-interface {v1, v0}, Lcn/dm/a/c/a;->onDownloadWaiting(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 83
a=0;//     :pswitch_3
a=0;//     invoke-interface {v1, v0}, Lcn/dm/a/c/a;->onDownloadSuccess(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 87
a=0;//     :pswitch_4
a=0;//     invoke-interface {v1, v0}, Lcn/dm/a/c/a;->onDownloadPause(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     :pswitch_5
a=0;//     invoke-interface {v1, v0}, Lcn/dm/a/c/a;->onDownloadCancel(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 95
a=0;//     :pswitch_6
a=0;//     invoke-interface {v1, v0}, Lcn/dm/a/c/a;->onDownloadResume(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 99
a=0;//     :pswitch_7
a=0;//     invoke-interface {v1, v0}, Lcn/dm/a/c/a;->onInstallSuccess(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     :pswitch_8
a=0;//     invoke-interface {v1, v0}, Lcn/dm/a/c/a;->onUninstallSuccess(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private a(ILcn/dm/a/a/a;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     invoke-virtual {p0}, Lcn/dm/a/h;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 153
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput p1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 155
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "data"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
a=0;// 
a=0;//     .line 156
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {p0, v0}, Lcn/dm/a/h;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcn/dm/a/h;->k:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 143
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/dm/a/h;->a(ILcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 162
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/dm/a/c/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcn/dm/a/h;->k:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 123
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/dm/a/h;->k:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v0, p0, Lcn/dm/a/h;->k:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 126
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// 
a=0;//     .line 126
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/dm/a/h;->a(ILcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 166
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcn/dm/a/c/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcn/dm/a/h;->k:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 136
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/dm/a/h;->a(ILcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 170
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c(Lcn/dm/a/c/a;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     iget-object v0, p0, Lcn/dm/a/h;->k:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public d(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/dm/a/h;->a(ILcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public e(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/dm/a/h;->a(ILcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 178
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public f(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/dm/a/h;->a(ILcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public g(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/dm/a/h;->a(ILcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 186
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public h(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     const/4 v0, 0x7
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/dm/a/h;->a(ILcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 190
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 2
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 55
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {p0, v0, v1}, Lcn/dm/a/h;->a(ILandroid/os/Bundle;)V
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public i(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/dm/a/h;->a(ILcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 194
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public j(Lcn/dm/a/a/a;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/dm/a/h;->a(ILcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 198
a=0;//     return-void
a=0;// .end method
}}
