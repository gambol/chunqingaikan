package safiap.framework.util; class a { void a() { int a;
a=0;// .class public final Lsafiap/framework/util/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:I
a=0;// 
a=0;// .field private static b:I
a=0;// 
a=0;// .field private static c:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     const/16 v0, 0x2760
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sput v0, Lsafiap/framework/util/a;->a:I
a=0;// 
a=0;//     .line 18
a=0;//     const/16 v0, 0x5a0
a=0;// 
a=0;//     sput v0, Lsafiap/framework/util/a;->b:I
a=0;// 
a=0;//     .line 136
a=0;//     const-string v0, "UpdateAlarm"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/util/a;->c:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/util/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     #v3=(Null);
a=0;//     const-string v0, "alarm"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/AlarmManager;
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lsafiap/framework/CheckUpdateReceiver;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 107
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {p0, v3, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 113
a=0;//     const-string v0, "safiap.framework_preferences"
a=0;// 
a=0;//     invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 116
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 117
a=0;//     const-string v1, "timer"
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 118
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 119
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;I)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const v8, 0xea60
a=0;// 
a=0;//     #v8=(Char);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v7=(Null);
a=0;//     sget-object v0, Lsafiap/framework/util/a;->c:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "setAlarmByHours...start, context.getPackageName: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", minutes: "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 63
a=0;//     if-gtz p1, :cond_0
a=0;// 
a=0;//     move v1, v7
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v1=(One);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {p0}, Lsafiap/framework/util/a;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "safiap.framework.ACTION_SET_TIMER"
a=0;// 
a=0;//     invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 71
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v2, Lsafiap/framework/CheckUpdateReceiver;->b:Ljava/lang/String;
a=0;// 
a=0;//     const/16 v3, -0x64
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 72
a=0;//     sget-object v2, Lsafiap/framework/CheckUpdateReceiver;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 75
a=0;//     const/high16 v2, 0x8000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p0, v7, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 79
a=0;//     #v6=(Reference,Landroid/app/PendingIntent;);
a=0;//     const-string v0, "alarm"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/AlarmManager;
a=0;// 
a=0;//     .line 83
a=0;//     if-lez p1, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-int v4, p1, v8
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     mul-int v4, p1, v8
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 87
a=0;//     const-string v0, "safiap.framework_preferences"
a=0;// 
a=0;//     invoke-virtual {p0, v0, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 90
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 91
a=0;//     const-string v2, "timer"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 92
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);
a=0;//     move v1, v7
a=0;// 
a=0;//     .line 97
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 122
a=0;//     #v0=(Null);
a=0;//     const-string v1, "safiap.framework_preferences"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 125
a=0;//     const-string v2, "timer"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 127
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;I)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/32 v7, 0x240c8400
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const-wide/32 v4, 0x5265c00
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 23
a=0;//     #v1=(One);
a=0;//     invoke-static {p0}, Lsafiap/framework/util/a;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 25
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lsafiap/framework/CheckUpdateReceiver;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 26
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {p0, v2, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 30
a=0;//     #v6=(Reference,Landroid/app/PendingIntent;);
a=0;//     const-string v0, "alarm"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/AlarmManager;
a=0;// 
a=0;//     .line 33
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 49
a=0;//     :pswitch_0
a=0;//     if-lez p1, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     int-to-long v4, p1
a=0;// 
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v6}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     :pswitch_1
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 35
a=0;//     :pswitch_2
a=0;//     #v1=(One);v2=(Null);v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :pswitch_3
a=0;//     #v2=(Null);v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v2, v7
a=0;// 
a=0;//     move-wide v4, v7
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Null);v3=(Reference,Ljava/lang/Class;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 55
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 33
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2710
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     sget-object v0, Lsafiap/framework/util/a;->c:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "initTimer...start, context.package: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     sget v0, Lsafiap/framework/util/a;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v0}, Lsafiap/framework/util/a;->a(Landroid/content/Context;I)Z
a=0;// 
a=0;//     .line 134
a=0;//     return-void
a=0;// .end method
}}
