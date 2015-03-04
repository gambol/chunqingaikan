package net.slidingmenu.tools.b.a; class c { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/c;
a=0;// .super Lnet/slidingmenu/tools/b/a/a;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static a:I
a=0;// 
a=0;// .field private static b:Ljava/lang/String;
a=0;// 
a=0;// .field private static c:Ljava/lang/String;
a=0;// 
a=0;// .field private static d:Ljava/lang/String;
a=0;// 
a=0;// .field private static e:Ljava/lang/String;
a=0;// 
a=0;// .field private static f:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/c;->a:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput p0, Lnet/slidingmenu/tools/b/a/c;->a:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final b()Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "0a4144490c4b1b441603124a5f42484d09115d5b4c0a00401d17554d0d590b16"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0a4144490c4b1b500e0d0405541b1f4d0714591c0c01111b411507164b41514d0d575c17"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lnet/slidingmenu/tools/b/a/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     sget v0, Lnet/slidingmenu/tools/b/a/c;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     const-string v0, "androidurl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1, v0}, Lnet/slidingmenu/tools/b/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "CN"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "androidurl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p2, v0}, Lnet/slidingmenu/tools/b/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, "androidurl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1, v0}, Lnet/slidingmenu/tools/b/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     const-string v0, "androidurl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p2, v0}, Lnet/slidingmenu/tools/b/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "androidurl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1, v0}, Lnet/slidingmenu/tools/b/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static final c()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/c;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "0a4144490c4b1b441603124a5f42484d09115d5b4c0a00401d0009114b41514d145746"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0a4144490c4b1b500e0d0405541b1f4d0714591c0c01111b411507164b560d114b4f064c155a46"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lnet/slidingmenu/tools/b/a/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static final d()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "0a4144490c4b1b431003050f16510b44481d5f470f0d4b5a571549145518030c004b5a0a011b45005b5b00575612"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0a4144490c4b1b431003050f16510b44481d5f470f0d4b5a571549145518030c004b5a0a011b45005b5b00575612"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lnet/slidingmenu/tools/b/a/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static final e()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "0a4144490c4b1b441603124a5f42484d09115d5b4c0a00401d121203101814514b5a5a0d03"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0a4144490c4b1b500e0d0405541b1f4d0714591c0c01111b411507164b41514d07565b05"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lnet/slidingmenu/tools/b/a/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static final f()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "0a4144490c4b1b441603124a5f42484d09115d5b4c0a00401d0016124b41514d005c433c104451004c55"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0a4144490c4b1b500e0d0405541b1f4d0714591c0c01111b411507164b41514d005c433c104451004c55"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lnet/slidingmenu/tools/b/a/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
