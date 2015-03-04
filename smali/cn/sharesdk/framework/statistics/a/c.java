package cn.sharesdk.framework.statistics.a; class c { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/statistics/a/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Landroid/content/SharedPreferences;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/statistics/a/c;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v0, "share_sdk_0"
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/a/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a/c;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/a/c;->c:Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/a/c;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcn/sharesdk/framework/statistics/a/c;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a/c;);
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/a/c;->c:Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/a/c;->c:Lcn/sharesdk/framework/statistics/a/c;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()J
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "service_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/Long;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;)J
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "buffered_snsconf_"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0, p2}, Lcn/sharesdk/framework/statistics/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()Z
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "upload_device_info"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "true"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public c()Z
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "upload_user_info"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "true"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public d()I
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/a/c;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "upload_share_content"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "true"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Byte);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);
a=0;//     const-string v1, "false"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public d(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "upload_device_info"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/statistics/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public e(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "upload_user_info"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/statistics/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public f(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "upload_share_content"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/statistics/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public g(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "buffered_snsconf_"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/statistics/a/c;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
