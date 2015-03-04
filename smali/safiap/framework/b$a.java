package safiap.framework; class b$a { void a() { int a;
a=0;// .class public Lsafiap/framework/b$a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/b;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x19
a=0;//     name = "a"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/b$a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Lsafiap/framework/SafFrameworkManager;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iput-object p1, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/b$a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lsafiap/framework/SafFrameworkManager;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     invoke-direct {p0, p1}, Lsafiap/framework/b$a;-><init>(Lsafiap/framework/SafFrameworkManager;)V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/b$a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/os/Message;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x7532
a=0;// 
a=0;//     .line 128
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "action_name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 129
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "NotifyHandler....msg.what:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v3, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", actionName:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 131
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 133
a=0;//     :pswitch_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->b(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v1, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->b(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "default"
a=0;// 
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 143
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v4}, Lsafiap/framework/SafFrameworkManager;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->b(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v1, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->b(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "default"
a=0;// 
a=0;//     invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 147
a=0;//     :pswitch_1
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "file_name"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v2, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v2}, Lsafiap/framework/SafFrameworkManager;->b(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->b(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\u60a8\u624b\u673a\u4e0a\u7684\u4e2d\u56fd\u79fb\u52a8\u8bdd\u8d39\u652f\u4ed8\u670d\u52a1\u65b0\u7248\u672c\u5df2\u7ecf\u4e0b\u8f7d\u5b8c\u6210\uff0c\u662f\u5426\u5b89\u88c5\uff1f"
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lsafiap/framework/SafFrameworkManager;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v0, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->b(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 157
a=0;//     :pswitch_2
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->b(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 158
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v0, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v4}, Lsafiap/framework/SafFrameworkManager;->b(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 164
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/b$a;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->d(Lsafiap/framework/SafFrameworkManager;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x3
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 173
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 174
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "action_name"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 175
a=0;//     packed-switch p3, :pswitch_data_0
a=0;// 
a=0;//     .line 187
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 190
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/b$a;->a(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 192
a=0;//     return-void
a=0;// 
a=0;//     .line 177
a=0;//     :pswitch_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 180
a=0;//     :pswitch_1
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 183
a=0;//     :pswitch_2
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 184
a=0;//     const-string v2, "file_name"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 175
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x3
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
