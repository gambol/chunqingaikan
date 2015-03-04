package net.slidingmenu.tools.b.a.f; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/f/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:I
a=0;// 
a=0;// .field private static b:I
a=0;// 
a=0;// .field private static c:I
a=0;// 
a=0;// .field private static d:I
a=0;// 
a=0;// .field private static e:I
a=0;// 
a=0;// .field private static f:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/f/a;->a:I
a=0;// 
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/f/a;->b:I
a=0;// 
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/f/a;->c:I
a=0;// 
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/f/a;->d:I
a=0;// 
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/f/a;->e:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const-class v5, Lnet/slidingmenu/tools/b/a/f/a;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v5
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v6=(Uninit);v7=(PosByte);v8=(PosByte);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->f(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->e(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, ""
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ""
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-le v6, v7, :cond_2
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     invoke-virtual {v4, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     :try_start_4
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_11
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_5
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-le v6, v8, :cond_4
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     invoke-virtual {v4, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     invoke-virtual {v4, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_6
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getPhoneType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v1, v6, :cond_8
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->a:I
a=0;// 
a=0;//     if-le v1, v9, :cond_5
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->b:I
a=0;// 
a=0;//     if-le v1, v9, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "0|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Integer);v6=(One);
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/gsm/GsmCellLocation;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sput v1, Lnet/slidingmenu/tools/b/a/f/a;->a:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/f/a;->b:I
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     sget v0, Lnet/slidingmenu/tools/b/a/f/a;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v9, :cond_7
a=0;// 
a=0;//     sget v0, Lnet/slidingmenu/tools/b/a/f/a;->b:I
a=0;// 
a=0;//     if-le v0, v9, :cond_c
a=0;// 
a=0;//     :cond_7
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "0|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ne v1, v6, :cond_10
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->c:I
a=0;// 
a=0;//     if-le v1, v9, :cond_9
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->e:I
a=0;// 
a=0;//     if-le v1, v9, :cond_9
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->d:I
a=0;// 
a=0;//     if-le v1, v9, :cond_9
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "1|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/telephony/CellLocation;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/reflect/Method;);
a=0;//     if-eqz v7, :cond_e
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);v8=(Conflicted);
a=0;//     array-length v0, v7
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_e
a=0;// 
a=0;//     aget-object v0, v7, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "getBaseStationId"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_b
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v6, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/f/a;->c:I
a=0;// 
a=0;//     :cond_a
a=0;//     :goto_4
a=0;//     #v3=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Null);v3=(Boolean);v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "getNetworkId"
a=0;// 
a=0;//     invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_d
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v6, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/f/a;->e:I
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_c
a=0;//     :try_start_7
a=0;//     const-string v0, ""
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_d
a=0;//     :try_start_8
a=0;//     #v0=(Null);v1=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v6=(Reference,Landroid/telephony/CellLocation;);v7=(Reference,[Ljava/lang/reflect/Method;);v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "getSystemId"
a=0;// 
a=0;//     invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v6, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/f/a;->d:I
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_1
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_e
a=0;//     :try_start_9
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v6=(Reference,Landroid/telephony/CellLocation;);v7=(Reference,[Ljava/lang/reflect/Method;);
a=0;//     sget v0, Lnet/slidingmenu/tools/b/a/f/a;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v9, :cond_f
a=0;// 
a=0;//     sget v0, Lnet/slidingmenu/tools/b/a/f/a;->e:I
a=0;// 
a=0;//     if-gt v0, v9, :cond_f
a=0;// 
a=0;//     sget v0, Lnet/slidingmenu/tools/b/a/f/a;->d:I
a=0;// 
a=0;//     if-le v0, v9, :cond_c
a=0;// 
a=0;//     :cond_f
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "1|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/f/a;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_10
a=0;//     #v3=(Null);v6=(PosByte);v7=(PosByte);v8=(PosByte);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/f/a;->f:Ljava/lang/String;
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_1
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Reference,Ljava/lang/String;);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_11
a=0;//     #v4=(Integer);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
}}
